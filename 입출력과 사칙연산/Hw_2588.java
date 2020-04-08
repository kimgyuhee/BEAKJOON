package beakjoon;

import java.util.Scanner;

public class Hw_2588 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a=scr.nextInt();
		int b=scr.nextInt();
		
		System.out.println(a*(b%100%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
