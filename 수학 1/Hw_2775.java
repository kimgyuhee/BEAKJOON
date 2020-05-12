package beakjoon9;

import java.util.Scanner;

public class Hw_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] a = new int[T];
		
		for(int i=0 ; i<T; i++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			int[][] b= new int[k+1][n];
			for(int j=0; j<n; j++) {
				b[0][j]=j+1;
				//System.out.print(b[0][j]+" ");
			}
			//System.out.println("");
			for(int w=0; w<=k; w++) {
				b[w][0]=1;
				//System.out.print(b[w][0]+" ");
			}
			
			for(int j=1; j<n; j++) {
				for(int w=1; w<=k; w++) {
					b[w][j]=b[w][j-1]+b[w-1][j];
					//b[1][1]=b[0][1]+b[1][0];
				}
				
				
			}
			
			a[i]=b[k][n-1];
		}
		
		
		for(int i=0; i<T; i++) {
			System.out.println(a[i]);
		}
		/************
		...
		5	/ 1  7  28    84   120
		4	/ 1  6  21    56   126  256
		3	/ 1  5  15   [35]  70   126 
		2	/ 1  4  (10)  20   35   56   84   120
		1	/ 1  3  (6)   10  15   21   28   36
		0	/ 1  2   3    4    5    6    7    8
		2틍 7호 = 5층 4호	-> 84
		1층 4호 = 2층 3호	-> 10
		1층 5호 = 3층 3호	-> 15
		2층 6호 = 4츨 4호	-> 56
		3층 4호 ->	1층 호(1+2+3+4)
				2층 4호()
		k층에 n호 m명 	->
		1층에 3호 6명 	-> ()  
		2층에 3호 10명	->
		3층에 2호 5명 	->
		*************/
	}

}
