package beakjoon6;

import java.util.Scanner;

public class Hw_3052 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			do {
				array[i]=s.nextInt();
			}while(!(array[i]>=0&&array[i]<=1000));
			array[i]=array[i]%42;
		}
		
		System.out.println("=====42·Î ³ª´«°ª=====");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(i==j)
					continue;
				if(array[i]==array[j])
					break;
				else {
					if(j==array.length-1)
						count++;
					else
						continue;
				}
			}
		}
		
		System.out.println("===============");
		
		System.out.println(count);
		
	}
}
