import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class prob2 {
	public static void main(String [] agrs) {
		Scanner input = new Scanner(System.in);
		String number  = input.nextLine();
		number.toCharArray()
		int move= input.nextInt();
		String[] cows = new String[number];
		String[] grass = new String[number];
		for(int i = 0; i<number; i++) {
			cows[i] = input.nextLine();
			grass[i] = ".";
			
		}
		
		Map<String, Integer> grassMap = new HashMap<>();

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
	}
}
		
			

