package beakjoon3;

import java.util.Scanner;
public class Hw_2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n;
		
		do {
			n=scr.nextInt();
		}while(!(n>0&&n<=100000));
		
		for(int i=n; i>=1; i--) {
			System.out.println(i);
		}
	}

}