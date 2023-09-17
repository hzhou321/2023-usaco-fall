package unsaco;

import java.util.Arrays;
import java.util.Scanner;
 
public class cowCollege {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] payList = new int[number];
		for(int i = 0; i<number; i++) {
			payList[i] = input.nextInt();
		}
		Arrays.sort(payList);
		
		int max = 0;
		int opt = 0;
		for (int i = 0; i < number; i++) {
			int pot = payList[i] * (number-i);
			if (pot > max) {
				max = pot;
				opt = payList[i];
			}
		}
		System.out.println(max+" "+opt);
		for (int i = 0; i < 4; i++) {
			int pot = payList[i] * (number-i);
			System.out.println(pot);
		}
	}
}
