package beakjoon1;

import java.util.Scanner;

public class Hw_10869 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a,b;
		do {
			a=scr.nextInt();
			b=scr.nextInt();
		}while(!(a>=1&&a<=10000&&b>=1&&b<=10000));
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
