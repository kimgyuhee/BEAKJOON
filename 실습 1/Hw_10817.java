package beakjoon5;

import java.util.Scanner;
public class Hw_10817 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System .in);
		int[] number = new int[3];
		int c;
		int rank=1;
		
		for(int i=0; i<number.length; i++) {
			do {
				number[i]=s.nextInt();
			}while(!(number[i]>=1&&number[i]<=100));
		}

		c=number[1];
		
		if((c>=number[0]&&c<=number[2])||(c<=number[0]&&c>=number[2]))
			c=number[1];
		else if(c>=number[0]&&c>=number[2])
			if(number[0]>number[2])
				c=number[0];
			else
				c=number[2];
		else if(c<=number[0]&&c<=number[2])
			if(number[0]>number[2])
				c=number[2];
			else
				c=number[0];
			
		
		System.out.println(c);
	}
}
