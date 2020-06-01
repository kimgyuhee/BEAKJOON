package beakjoon4;

import java.util.Scanner;

public class Hw_10952 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a,b;
		String s="";
		
		while(true) {
			do {
				a=scr.nextInt();
				b=scr.nextInt();
				if(a==0&&b==0)
					break;
			}while(!(a>0&&b>0&&a<10&&b<10));
			if(a==0&&b==0)
				break;
			s+=(a+b)+"\n";
		}
		
		System.out.println(s);
	}
}
