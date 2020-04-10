package beakjoon5;
import java.util.Scanner;
public class Hw_2446 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			n=s.nextInt();
		}while(!(n>=1&&n<=100));
		
		for(int i=n; i>=1; i--) {
			for(int k=n-i; k>=1; k--) {
				System.out.print(" ");
			}
			for(int j=(2*i-1); j>=1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=2; i<=n; i++) {
			for(int k=n-i; k>=1; k--) {
				System.out.print(" ");
			}
			for(int j=(2*i-1); j>=1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
