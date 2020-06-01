package beakjoon8;

import java.util.Scanner;
public class Hw_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t;
		do {
			t=sc.nextInt();
		}while(!(t>=1&&t<=1000));
		
		int[] c = new int[t];
		String [] s = new String[t];
		for(int i=0; i<t; i++) {
			s[i]="";
			do {
				c[i]=sc.nextInt();
			}while(!(c[i]>=1&&c[i]<=8));
			
			String ss=sc.next();
			for(int j=0; j<ss.length(); j++) {
				for(int k=0; k<c[i]; k++) {
					s[i]=s[i]+ss.charAt(j);
				}
			}
		}
		for(int i=0; i<t; i++) {
			System.out.println(s[i]);
		}
	}

}
