package beakjoon2;

import java.util.Scanner;

public class Hw_2884 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int H,M;
		
		do {
			H=scr.nextInt();
			M=scr.nextInt();
		}while(!(H>=0&&H<=23&&M>=0&&M<=59));
		
		if(M-45>=0) {
			System.out.println(H+" "+(M-45));
		}else {
			if(H==0)
				H=23;
			else
				H=H-1;
			M=60+M-45;
			System.out.println(H+" "+M);
		}
	}
}
