package beakjoon5;
import java.util.Scanner;
public class Hw_10996 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			n=s.nextInt();
		}while(!(n>=1&&n<=100));
		
		for(int i=1; i<=n; i++) {
			if(n%2==0) {
				for(int j=(n/2)+1; j>1; j--) {
					System.out.print("* ");
				}
				System.out.print("\n");
				for(int k=(n/2);k>=1; k--) {
					System.out.print(" *");
				}
				System.out.print("\n");
			}else {
				for(int j=(n/2)+1; j>=1; j--) {
					System.out.print("* ");
				}
				System.out.print("\n");
				for(int k=(n/2);k>=1; k--) {
					System.out.print(" *");
				}
				System.out.print("\n");
			}
		}
		
	}
}
