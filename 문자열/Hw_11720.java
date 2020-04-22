package beakjoon8;

import java.util.Scanner;
public class Hw_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			n=sc.nextInt();
		}while(!(n>=1&&n<=100));
		
		String s = sc.next();
		int sum=0;
		for(int i=0; i<n; i++) {
			char a =s.charAt(i);
			int b =(int)a-48;
			sum+=b;
		}
		
		System.out.println(sum);
	}

}
