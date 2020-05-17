package beakjoon9;

import java.util.Scanner;

public class Hw_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int n=0;
		int i=0;
		int x=0, y=0;
		while(X>n) {
			if(X<=n+i)
				break;
			n=n+i;
			i++;
		}
		
		if(i%2!=0) {
			x=i-(X-n-1);
			y=X-n;
		}else {
			y=i-(X-n-1);
			x=X-n;
		}
		System.out.println(x+"/"+y);
		
	}
}
