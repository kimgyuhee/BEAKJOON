package beakjoon;

import java.util.Scanner;
import java.util.Arrays;
public class Bj_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] array = new int[N];
		boolean e = false;


		for(int i=0; i<N; i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		for(int i : array) {
			System.out.println(i);
		}
	}

}
