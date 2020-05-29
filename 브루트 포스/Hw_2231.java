package beakjoon13;

import java.util.Scanner;
public class Hw_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int result=0;
		int sum=0;
		
		if(N>=1 && N<10)
			result=0;
		else {
			for(int i=10; i<N; i++) {
				sum=0;
				String s = Integer.toString(i);
				sum=sum+i;
				for(int j=0; j<s.length();j++) {
					sum+=((int)s.charAt(j)-48);
				}
				
				if(sum==N) {
					result=i;
					break;
				}
			}
		}
		
		System.out.println(result);
	
	}
}
