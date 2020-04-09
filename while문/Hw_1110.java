package beakjoon4;

import java.util.Scanner;

public class Hw_1110 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n; // 새로운수
		int i=0; // 사이클 수
		int x,y; // 각 자리 숫자
		int a; // 각 자리 더한값
		int b=0; // 조합한 숫자
		do {
			n=s.nextInt();
		}while(!(n>=0&&n<=99));

		b=n;
		while(true) {
			i++; //횟수
			x=b/10; //십의 자리 숫자
			y=b%10; // 일의 자리 숫자
			a=(b/10)+(b%10); // 각자리 숫자 합
			b=(y*10)+(a%10); 
			//새로운 수의 1의 자리를 10의 자리로하고 각자리 숫자 합의 1의 자리를 1일자리로 한다.			
			if(b==n)
				break;
		}
		
		System.out.println(i);
		
		
	
	}

}
