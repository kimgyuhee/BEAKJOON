package beakjoon2;

import java.util.Scanner;

public class Hw_2753 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int year;

		do {
			year=scr.nextInt();
		}while(!(year>=1&&year<=4000));
		
		
		if(year%4!=0) {
			System.out.println(0);
		}else {
			if(year%400==0)
				System.out.println(1);
			else if(year%100==0)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}
}


/*********
 4 8 12 16 20 24 28 32
**********/