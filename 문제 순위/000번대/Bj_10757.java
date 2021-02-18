package beakjoon;

import java.util.Scanner;
public class Bj_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int l= a.length() > b.length() ? a.length():b.length();

		System.out.println("l의 길이는 ? " +l);
		int[] A = new int[l];
		int[] B = new int[l];
		int[] sum= new int[l+1];

		int count=0;
		for(int i =l-a.length(); i<l; i++) {
			A[i]=(a.charAt(count)-48);
			count++;
		}

		count=0;
		for(int i =l-b.length(); i<l; i++) {
			B[i]=(b.charAt(count)-48);
			count++;
		}
		System.out.println("A의배열");
		for(int i=0;i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("B의배열");
		for(int i=0;i<B.length; i++) {
			System.out.print(B[i]+" ");
		}

		System.out.println();

		for(int i=sum.length-1;i>0;i--) {
			if(A[i-1]+B[i-1]>=10) {
				sum[i]=sum[i]+A[i-1]+B[i-1]-10;
				sum[i-1]+=1;
			}else {
				sum[i]=sum[i]+A[i-1]+B[i-1];
				if(sum[i]==10) {
					sum[i]=0;
					sum[i-1]+=1;
				}
			}

		}

		System.out.println("A와 B 배열의 합계 ?");
		if(sum[0]==0) {
			for(int i=1;i<sum.length; i++) {
				System.out.print(sum[i]);
			}
		}else {
			for(int i=0;i<sum.length; i++) {
				System.out.print(sum[i]);
			}
		}

	}
}
