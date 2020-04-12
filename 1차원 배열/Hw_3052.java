package beakjoon6;

import java.util.Scanner;

public class Hw_3052 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		int[] array = new int[10];
		int[] rest=new int[42];
		
		for(int i=0; i<array.length; i++) {
			do {
				array[i]=s.nextInt();
			}while(!(array[i]>=0&&array[i]<=1000));
			array[i]=array[i]%42;
		}
		
		
		for(int i=0; i<rest.length; i++) {
			rest[i]=0;
		}
		
		for(int j=0; j<array.length; j++) {
			rest[array[j]]++;
		}
		
		for(int i=0; i<rest.length; i++) {
			if(rest[i]!=0)
				count++;
		}
		
		System.out.println(count);
		
	}
}
