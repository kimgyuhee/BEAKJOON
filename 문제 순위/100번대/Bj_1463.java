package beakjoon;

import java.util.Scanner;

public class Bj_1463 {
	static int[] d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		d= new int[n+1];
		
		System.out.println(dp(n));
		sc.close();
	}
	
	private static int dp(int n) {
		if(n==1)
			return 0;
		if(d[n] > 0)
			return d[n];
		d[n]=dp(n-1)+1;
		if(n%2==0) {
			int tmp = dp(n/2)+1;
			if(d[n]>tmp)
				d[n]=tmp;
		}
		if(n%3==0) {
			int tmp= dp(n/3)+1;
			if(d[n]>tmp)
				d[n]=tmp;
		}
		
		return d[n];
	}
}

/*******************************


public class Bj_1463 {
	static int instanceCount = 0;
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int n=N;
		
		while(N!=1) {
			three(N);
			two(N);
			m(N);
		}
		System.out.println(instanceCount);
		int n1=instanceCount;
		
		instanceCount=0;
		N=n;
		
		while(N!=1) {
			two(N);
			three(N);
			m(N);
		}
		
		System.out.println(instanceCount);
		int n2=instanceCount;
		
		instanceCount=0;
		N=n;
		
		while(N!=1) {
			m(N);
			three(N);
			two(N);
		}
		
		System.out.println(instanceCount);
		int n3=instanceCount;
		
		
		if(n1>n2)
			System.out.println(n2>n3 ? n3 : n2);
		else
			System.out.println(n1>n3 ? n3 : n1);
		

	}
	
	static void three(int n3) {
		if(N==1)
			return;
		System.out.println("3으로 나눈 결과  : "+N);
		if(n3%3==0) {
			instanceCount++;
			N=n3/3;
			three(N);
		}else {
			if(n3%2==0)
				two(N);
			else
				m(N);
		}
	}
	
	static void two(int n2) {
		if(N==1)
			return;
		System.out.println("2으로 나눈 결과  : "+N);
		if(n2%2==0) {
			instanceCount++;
			N=n2/2;
			two(N);
		}else {
			if(n2%3==0)
				three(N);
			else
				m(N);
		}
	}
	
	static void m(int n1) {
		if(N==1)
			return;
		System.out.println("1뺸결과  : "+N);
		
		if(n1%3==0)
			three(N);
		else if(n1%2==0)
			two(N);
		else {
			instanceCount++;
			N=n1-1;
			m(N);
		}
	}

}

**********************************/
