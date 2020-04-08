package beakjoon1;

import java.util.Scanner;

public class Hw_10998 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a,b;
		do {
			a=scr.nextInt();
			b=scr.nextInt();
		}while(a<1 || a>9 && (b<1 || b>9));
		System.out.println(a*b);
	}
}
