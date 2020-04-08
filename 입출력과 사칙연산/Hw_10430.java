package beakjoon;

import java.util.Scanner;

public class Hw_10430 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a,b,c;
		do {
			a=scr.nextInt();
			b=scr.nextInt();
			c=scr.nextInt();
		}while(!(a>=2&&a<=10000&&b>=2&&b<=10000&&c>=2&&c<=10000));
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
