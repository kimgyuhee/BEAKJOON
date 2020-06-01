package beakjoon5;

import java.util.Scanner;


public class Hw_10039 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] s_grade = new int[5];
		int sum=0;
		
		for(int i=0; i<s_grade.length ;i++) {
			do {
				s_grade[i]=s.nextInt();
			}while(!(s_grade[i]>=0&&s_grade[i]<=100&&s_grade[i]%5==0));
			
			if(s_grade[i]<40)
				s_grade[i]=40;
			sum+=s_grade[i];
		}
		
		System.out.println(sum/s_grade.length);
	}
}
