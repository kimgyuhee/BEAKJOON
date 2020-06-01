package beakjoon7;

import java.util.Scanner;
public class Hw_15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			do {
				a[i]=sc.nextInt();
			}while(!(a[i]>=0));
		}
		System.out.println(sum(a));
	}

	public static long sum(int[] a) {
		long sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
/******** 함수구현 *********
public class Test {
	long sum(int[] a) {
		long ans=0;
		for(int i=0; i<a.length; i++)
			ans+=a[i];
		return ans;
	}
}
************************/