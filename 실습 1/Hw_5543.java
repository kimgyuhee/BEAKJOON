package beakjoon5;

import java.util.Scanner;

public class Hw_5543 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] menu = new int[5];
		int burger=2000;
		int drink=2000;
		
		for(int i=0; i<menu.length; i++) {
			do {
				menu[i]=s.nextInt();
			}while(!(menu[i]>=100&&menu[i]<=2000));
			
			if(i<3) {
				if(burger>menu[i])
					burger=menu[i];
			}
			else
				if(drink>menu[i])
					drink=menu[i];
		}
		
		System.out.println(burger+drink-50);
	}
}
