package beakjoon2;

import java.util.Scanner;

public class Hw_14681 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int x,y;
		
		do {
			x=scr.nextInt();
		}while(!(x>=1000&&x<=1000||x!=0));
		
		do {
			y=scr.nextInt();
		}while(!(y>=1000&&y<=1000||y!=0));
		
		if(x>0) {
			if(y>0)
				System.out.println(1);
			else
				System.out.println(4);
		}else {
			if(y>0)
				System.out.println(2);
			else
				System.out.println(3);
		}
	}
}
