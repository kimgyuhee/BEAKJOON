package beakjoon10;

import java.util.Scanner;
public class Hw_3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		System.out.println(String.format("%6f", Math.PI*(r*r)));
		System.out.println(String.format("%6f", r*r*2));
	}
}
