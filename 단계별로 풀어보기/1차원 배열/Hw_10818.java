package beakjoon6;

import java.util.Scanner;
public class Hw_10818 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			n=s.nextInt();
		}while(!(n>=1));
		
		int[] array = new int[n];
		
		for(int i=0; i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int min=array[0];
		int max=array[0];
		for(int i=1; i<n; i++) {
			if(min>array[i])
				min=array[i];
			
			if(max<array[i])
				max=array[i];
		}
		
		System.out.println(min+" "+max);
	}

}
