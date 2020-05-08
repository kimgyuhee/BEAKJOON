package beakjoon11;

import java.util.Scanner;
public class Hw_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int result=1;
		do {
			N=sc.nextInt();
		}while(!(N>=0&&N<=12));
		
		if(N==0) {
			result=1;
		}else {
			for(int i=1; i<=N;i++) {
				result=result*i;
			}
		}
		
		System.out.println(result);
		
		
	}

}
