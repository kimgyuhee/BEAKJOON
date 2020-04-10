package beakjoon5;

import java.util.Scanner;
public class Hw_10817 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System .in);
		int[] number = new int[3];
		int c=100;
		int rank=1;
		for(int i=0; i<number.length; i++) {
			do {
				number[i]=s.nextInt();
			}while(!(number[i]>=1&&number[i]<=100));
			
		}
		
		System.out.println();
	}
}
