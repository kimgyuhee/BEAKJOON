package beakjoon6;
import java.util.Scanner;
public class Hw_2577 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c;
		int[] count= new int[10];
		do {
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
		}while(!(a>=100&&a<1000&&b>=100&&b<1000&&c>=100&&c<1000));
		
		String sum=(a*b*c)+"";
		
		for(int i=0; i<sum.length(); i++) {
			int n=Integer.parseInt(sum.substring(i, i+1));
			count[n]++;
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
