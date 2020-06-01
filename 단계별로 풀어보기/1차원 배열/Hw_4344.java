package beakjoon6;

import java.util.Scanner;
public class Hw_4344 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int c=s.nextInt();
		int[] test = new int[c];
		double[] sum = new double[c];
		int[] person = new int[c];
		for(int i=0; i<c; i++) {
			test[i]=s.nextInt();
			sum[i]=0;
			person[i]=0;
			double[] score = new double[test[i]];
			for(int j=0; j<test[i]; j++) {
				score[j]=s.nextInt();
				sum[i]+=score[j];
			}
			sum[i]=sum[i]/test[i];
			for(int j=0; j<test[i]; j++) {
				if(sum[i]<score[j])
					person[i]++;
			}
			sum[i]=(double)person[i]/test[i];
		}
		
		for(int i=0 ; i<c; i++) {
			System.out.printf("%.3f"+"%%"+"\n",sum[i]*100);
		}
		
	}

}
