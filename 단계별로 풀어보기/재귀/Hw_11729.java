package beakjoon11;

import java.util.Scanner;
public class Hw_11729 {
	static StringBuilder sb = new StringBuilder(); // ¿Ö ?
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		do{
			N=sc.nextInt();
		}while(!(N>=1&&N<=20));
		
		
		move(1,3,2,N);
		
		System.out.println(count);
		System.out.println(sb);
			
	}
	
	public static void move(int from, int to, int other, int n) {
		if(n==0) {
			return;
		}else {
			count++;
			move(from,other,to,n-1);
			sb.append(from+" "+to+"\n");
			move(other,to,from,n-1);
			
			
		}
		
	}
}
