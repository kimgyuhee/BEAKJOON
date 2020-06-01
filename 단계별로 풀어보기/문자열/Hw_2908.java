package beakjoon8;
import java.util.Scanner;
public class Hw_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A=sc.next();
		String B;
		do {
			B=sc.next();
		}while(A.equals(B));
		
		String temp="";
		for(int i=A.length()-1;i>=0;i--)
			temp+=A.charAt(i);
		A=temp;
		
		temp = "";
		for(int i=B.length()-1;i>=0;i--)
			temp+=B.charAt(i);
		B=temp;

		int num1=Integer.parseInt(A);
		int num2=Integer.parseInt(B);
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		/**************************
		String winner="";
		for(int i=A.length()-1; i>=0; i--) {
			if((int)A.charAt(i)>(int)B.charAt(i)) {
				winner=A;
				break;
			}
			else if((int)A.charAt(i)<(int)B.charAt(i)) {
				winner=B;
				break;
			}
			else
				continue;
		}
		
		System.out.println(winner);
		
		******************************/
	}

}
