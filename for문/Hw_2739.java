package beakjoon3;

import java.util.Scanner;
public class Hw_2739 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n;
		
		do{
			n=scr.nextInt();
		}while(!(n>=1&&n<=9));
		
		for(int i=1; i<=9; i++) {
			System.out.println(n+" * " +i+" = "+n*i);
		}
	}
}
