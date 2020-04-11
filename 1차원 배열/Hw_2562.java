package beakjoon6;

import java.util.Scanner;

public class Hw_2562 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[9];
		int index=0;
		int max=0;
		for(int i=0; i<n.length; i++) {
			do {
				n[i]=s.nextInt();
			}while(!(n[i]>=1&&n[i]<=100));
			
			if(max<n[i]) {
				max=n[i];
				index=i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}
}
