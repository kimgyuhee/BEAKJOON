package beakjoon10;

import java.util.Scanner;
public class Hw_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt(); 
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		int min=(x > y ? y : x);
		min=(min > h-y ? h-y : min);
		min=(min > w-x ? w-x : min);
		
		System.out.println(min);
		
	}

}
