package beakjoon8;
import java.util.Scanner;
public class Hw_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		s=s.toUpperCase();
		int[] a = new int[26];
		int max=0;
		int index=0;
		
		for(int i=0;i<s.length();i++) {
			a[((int)s.charAt(i))-65]++;
		}
		
		for(int i=0; i<a.length; i++) {
			if(max<=a[i]) {
				max=a[i];
				index=i;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			if(i==index)
				continue;
			if(max==a[i])
				index=-2;
		}
		
		System.out.printf("%c", index+65);
		
	}

}
