package beakjoon3;

import java.util.Scanner;
public class Hw_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n,a,b;
		n=scr.nextInt();
		int[] array=new int[n];
		
		for(int i=0;i<n;i++) {
			do{
				a=scr.nextInt();
				b=scr.nextInt();
			}while(!(a>=1&&a<=9&&b>=1&&b<=9));
			array[i]=a+b;
		}
		
		for(int j=0; j<n;j++)
			System.out.println(array[j]);
	}

}
