package beakjoon14;

import java.util.Arrays;
import java.util.Scanner;
public class Hw_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*****************
		int N=sc.nextInt();
		String s = N+"";
		String result="";
		int[] a= new int[s.length()];
		System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			a[i]=(int)s.charAt(i);
		}
		
		Arrays.sort(a);
		
		for(int i=0; i<s.length(); i++) {
			result+=(char)a[i];
		}
		
		int r=Integer.parseInt(result);
		System.out.println(r);
		**********************/
		String N=sc.nextLine();
		
		int size=N.length();
		char[] arr = new char[size];
		
		for(int i=0; i<N.length(); i++) {
			arr[i]=N.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]);
	}

}
