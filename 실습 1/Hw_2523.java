package beakjoon5;
import java.util.Scanner;
public class Hw_2523 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			n=s.nextInt();
		}while(!(n>=1&&n<=100));
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int a=n-1; a>=1; a--) {
			for(int b=a; b>=1; b--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
