import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class prob2 {
	public static void main(String [] agrs) {
		Scanner input = new Scanner(System.in);
		int number  = input.nextInt();
		int move= input.nextInt();
		String[] cows = new String[number];
		String[] grass = new String[number];
		for(int i = 0; i<number; i++) {
			cows[i] = input.nextLine();
			grass[i] = ".";
			
		}
		
		Map<String, Integer> grassMap = new HashMap<>();
//		int grass_index = grassMap.get("G");
//		grassMap.put("G", 1);
//		grassMap.put("G", 2);
//		grassMap.put("H", 2);
		
//		int index = grassMap.get("H");
//		boolean gExisted = grassMap.containsKey("G");
//		boolean hExisted = grassMap.containsKey("H");
	/*
	 * 1. Check if the patch exists (if not, add one
	 * 2. If patch exists, retrieve the position of cow and use (abs(cowPos-grass) > move) to determine if patch is reachable
	 * 3. If not, create a new patch according to position of cow + move using HashMap
	 * 4. After all calculations, set blank spots to "."	
	 */
		
//	//1. Check if the patch exists (if not, add one)
//		for (int i = 0; i <= move; i++) {
//			if (gExisted == false && cows[i] == "G") {
//				grassMap.put("G", i+move);
//				grass[i+move] = "G";
//			}else if (hExisted == false && cows[i] == "H") {
//				grassMap.put("H", i+move);
//				grass[i+move] = "H";
//			}
//		}
	
		

	// 3. If not, create a new patch according to position of cow + move using HashMap

		for (int i = 0; i < number; i++) {
			boolean gExisted = grassMap.containsKey("G");
			boolean hExisted = grassMap.containsKey("H");
			if (gExisted == false && cows[i] == "G") {
				grassMap.put("G", i+move);
				grass[i+move] = "G";
				continue;
			}else if (hExisted == false && cows[i] == "H") {
				grassMap.put("H", i+move);
				grass[i+move] = "H";
				continue;
			}
			
			int gIndex = grassMap.get("G");
			int hIndex = grassMap.get("H");
			if (cows[i] == "G")
				if (Math.abs(i-gIndex) < move) {
					grassMap.put("G", i+move);
					grass[i+move] = "G";
			}
		    else if(cows[i] == "H") {
		    	if (Math.abs(i-hIndex) < move) {
					grassMap.put("H", i+move);
					grass[i+move] = "H";
				}
		    }
			
		}
		for (int i = 0; i < number; i++) {
			System.out.print(grass[i] + " ");
		}
		
			
			
		}
	}
