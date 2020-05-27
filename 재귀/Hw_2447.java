package beakjoon11;

import java.util.Arrays;
import java.util.Scanner;
public class Hw_2447 {
	static char[][] board;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		board = new char[N][N];
	
		for(int i=0; i<N; i++) {
			Arrays.fill(board[i], ' ');
		}
		
		makeStar( 0, 0,N);
		
		for(int i=0; i<N; i++) {
			System.out.println(board[i]);
		}
	}
	
	public static void makeStar(int x, int y, int n) {
		if(n==1) {
			board[x][y]='*';
			return;
		}
		int k=n/3;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				//i=0 j=1 k=3
				//i=0 j=2 k=3
				//i=1 j=0 k=3
				
				if(i==1&&j==1) {
					continue;
				}
				makeStar(x+k*i, y+k*j, k);
				//0 3 3 -> 0 3 1
				//0 6 3 -> 0 6 1
				//3 0 3 -> 3 0 1
			}
		}
	}
}

/***************************
makeStar(0,0,1) 의 결과 -> N이 3일때
 ***
 * *
 ***

makeStar(0,0,3) 의 결과 -> N이 9일때
 *********
 * ** ** *
 *********
 ***   ***
 * *   * *
 ***   ***
 *********
 * ** ** *
 *********
 
**************************/
