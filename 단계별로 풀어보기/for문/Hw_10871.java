package beakjoon3;

import java.util.Scanner;

public class Hw_10871 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n,x;
		String s="";
		do {
			n=scr.nextInt();
			x=scr.nextInt();
		}while(!(n>=1&&n<=10000&&x>=1&&x<=10000));
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			do {
				a[i]=scr.nextInt();
			}while(!(a[i]>=1&&a[i]<=10000));
			
			if(x>a[i])
				s+=a[i]+" ";
		}
		
		System.out.println(s);
		
	}
}
