package beakjoon2;

import java.util.Scanner;

public class Hw_1330 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a,b;
		do {
			a=scr.nextInt();
			b=scr.nextInt();
		}while(!(a>=-10000&&a<=10000&&b>=-10000&&b<=10000));
	
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else
			System.out.println("==");
	}
}
