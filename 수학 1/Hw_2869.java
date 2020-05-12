package beakjoon9;

import java.util.Scanner;
public class Hw_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int V=sc.nextInt();
		
		if((V-B)%(A-B)!=0)
			System.out.println((V-B)/(A-B)+1);
		else
			System.out.println((V-B)/(A-B));
	}

}
