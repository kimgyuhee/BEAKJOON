package beakjoon13;

import java.util.Scanner;
/***********************************
어떤 사람의 몸무게 : x
어떤 사람의 키 : y
	-> (x, y)
			
		
*************************************/
public class Hw_7568 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] rank = new int[N];
		
		int[][]  record = new int[2][N]; // 몸무게랑 키 기록표
		for(int i=0; i<N; i++) { 
			record[0][i]=sc.nextInt();
			record[1][i]=sc.nextInt();
			rank[i]=1;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i==j)
					continue;
				else {
					if((record[0][i]<record[0][j])&&(record[1][i]<record[1][j]))
						rank[i]++;
				}
			}
				
		}
		
		for(int i=0; i<N; i++) {
			System.out.println("<"+record[0][i]+", "+record[1][i]+"> : 등수  ->"+ rank[i]);
		}
		for(int i=0; i<N; i++) {
			System.out.print(rank[i]+" ");
		}
		
	}

}
