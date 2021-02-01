package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2558 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A,B;
		
		do {
			A=Integer.valueOf(br.readLine());
			B=Integer.valueOf(br.readLine());
		}while(!(A>0&&A<10&&B>0&&B<10));
		br.close();
		System.out.println(A+B);
	}

}
