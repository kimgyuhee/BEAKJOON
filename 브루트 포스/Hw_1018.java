package beakjoon13;

import java.util.Scanner;
public class Hw_1018 {
	
	private static char[][] trans; // 8x8의 체스판을 뜯어 내 저장하는 체스판 변수이다.
	private static char[][] arr; // nxm의 보드를 저장할 변수이다.
	static final char[][] white= { //(0,0)이 W일 때 가질 수 있는 규칙이다.
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, 
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, 
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, 
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'} 
			}; 
	
	static final char[][] black= { // (0,0)이 B일 때 가질 수 있는 규칙이다.
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, 
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, 
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, 
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
			}; 
	
	
	public static int trans(int a, int b, int min) {
		int cnt_b=0;
		int cnt_w=0;
		int k=0;
		StringBuilder builder = new StringBuilder("");
		for(int i=a; i<a+8; i++) {
			builder.setLength(0); // StringBuilder 초기화, 공백으로 만든다.
			
			for(int j=b; j<b+8; j++) {
				builder.append(arr[i][j]);
			}
			
			for(int j=0; j<builder.length(); j++) {
				trans[k][j]=builder.charAt(j); // 행 단위로 체스판 배열에 저장
			}
			k++;
		}
		
		for(int i=0; i<trans.length; i++)  { // 체스판을 탐색
			for(int j=0; j<trans[i].length; j++) {
				if(trans[i][j]!=black[i][j]) {
					cnt_b++;
				}
				if(trans[i][j]!=white[i][j]) {
					cnt_w++;
				}
			}
			
		}
		
		return Math.min(Math.min(cnt_w, cnt_b), min); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		arr = new char[N][M];
		trans = new char[8][8];
		
		for(int i=0; i<N; i++) {
			String row = sc.next();
			
			for(int j=0; j<M; j++) {
				arr[i][j]=row.charAt(j);
			}
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				min=trans(i,j,min);
			}
		}
		
		System.out.println(min);
		
	}

}
