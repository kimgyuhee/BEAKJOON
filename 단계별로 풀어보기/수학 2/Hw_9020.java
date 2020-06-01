package beakjoon10;

import java.util.Scanner;
public class Hw_9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] array = new int[T][2];

		for(int i=0; i<T; i++) {
			int n=sc.nextInt();

			int a=n/2;
			int b=n/2;

			for(int k=a; k>0; k--) {
				if(check(k)&&check(b)) {
					array[i][0]=k;
					array[i][1]=b;
					break;
				}
				b++;


			}
		}

		for(int i=0; i<T; i++) {
			System.out.println(array[i][0]+" "+array[i][1]);
		}

	}

	public static boolean check(int n) {

		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	/****************************************
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] array = new int[T][2];

		for(int i=0; i<T; i++) {
			int n=sc.nextInt();

			int a=n/2;
			int b=n/2;

			boolean num1=true; //첫번쨰 수가 소수인가 ?
			boolean num2=true; //두번쨰 수가 소수인가 ?

			for(int k=a; k>0; k--) {
				//a가 소수인지 확인
				if(k<=1)
					num1=false;
				else{
					for(int j=2; j<=k/2; j++)
						if(k%j==0) {
							num1=false;
							break;
						}
				}
				System.out.println("num1 -> "+num1);

				//b가 소수인지 확인
				if(b<=1)
					num2=false;
				else{
					for(int j=2; j<=b/2; j++)
						if(b%j==0) {
							num2=false;
							break;
						}
				}
				System.out.println("num2 -> "+num2);

				System.out.println(k+" "+b);
				System.out.println(num1+" "+num2);
				if(num1==true&&num2==true) {
					array[i][0]=b;
					array[i][1]=k;
					break;
				}

				b++;


			}
		}

		for(int i=0; i<T; i++) {
			System.out.println(array[i][0]+" "+array[i][1]);
		}

	 *****************************************/
}
