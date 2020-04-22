package beakjoon6;
import java.util.Scanner;
public class Hw_1546 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n; // 시험본 과목
		int zero=0;
		do {
			n=s.nextInt();
		}while(!(n>0&&n<=1000));
		
		// 과목들의 점수
		double m=0; // 가장 잘 본과목
		double[] score = new double[n];
		for(int i=0 ; i<n; i++) {
			
			do{
				score[i]=s.nextInt();
			}while(!(score[i]>=0&&score[i]<=100));
			
			if(zero==n-1) {
				do {
					score[i]=s.nextInt();
				}while(score[i]==0);
			}
			if(m<score[i])
				m=score[i];
			
			if(score[i]==0)
				zero++;
		}
		
		double sum=0;
		for(int i=0; i<n; i++) {
			score[i]=(double)score[i]/m*100;
			sum+=score[i];
		}
		
		System.out.println(sum/n);
		
	}
}
