package beakjoon11;

import java.util.Scanner;
public class Hw_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n=sc.nextInt();
		}while(!(n>=0&&n<=20));

		int fn=0;
		int f0=0;
		int f1=1;

		if(n==0) {
			fn=0;
		}else if(n==1) {
			fn=1;
		}
		else {
			for(int i=0; i<n-1; i++) {
				fn=f0+f1;
				f0=f1;
				f1=fn;
			}
		}
		System.out.println(fn);
	}

}
