package beakjoon8;

import java.util.Scanner;
public class Hw_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/************************
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			s=sc.next();
		}while(s.length()>=100);
		
		int[] a = new int[26];
		for(int i=0; i<a.length; i++) {
			a[i]=-1;
		}
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			int w = (int)c-97;
			if(a[w]==-1)
				a[w]=i;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		******************/
		Scanner sc = new Scanner(System.in); 
        String input = sc.next();

        for (char c = 'a' ; c <= 'z' ; c++) 
               System.out.print(input.indexOf(c) + " ");
	}

}
