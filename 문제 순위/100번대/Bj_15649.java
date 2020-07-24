package beakjoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Bj_15649 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int N;
		int M;
		
		do {
			N=sc.nextInt();
			M=sc.nextInt();
		}while(!(N>=1&&N<=8&&M>=1&&M<=8));
		
		int n=N;
		int store=1;
		
		for(int i=M; i>0; i--) {
			store=store*n--;
		}
		
		int[][] array = new int[M][store];
		
		int[] number = new int[N];
		
		System.out.println(N);
		for(int i=0; i<N ;i++) {
			number[i]=i+1;
		}

		System.out.print("[ ");
		for(int i=0; i<N ;i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.println(" ]");
		
		
		for(int i=0; i<M;i++) {
			for(int j=0; j<store; j++) {
				array[i][j]=number[(i+j)%4];
			}
		}
		
		for(int i=0; i<store;i++) {
			for(int j=0; j<M; j++) {
				System.out.print(array[j][i]+" ");
			}
			
			System.out.println();
		}
		
		
	}
}
