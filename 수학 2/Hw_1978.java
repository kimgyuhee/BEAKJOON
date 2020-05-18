package beakjoon10;

import java.util.Scanner;
public class Hw_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int N=sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int n=sc.nextInt();
			if(n==1) {
				continue;
			}
			else if(n==2||n==3||n==5||n==7) {
				count++;
				continue;
			}
			else if(n%2!=0&&n%3!=0&&n%5!=0&&n%7!=0) {
				count++;
			}
			else
				continue;
		}
		
		System.out.println(count);
	}

}
