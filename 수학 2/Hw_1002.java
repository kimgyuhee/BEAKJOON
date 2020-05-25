package beakjoon10;

import java.util.Scanner;
public class Hw_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] count = new int[T];
		for(int i=0; i<T; i++) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int r1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			int r2=sc.nextInt();
			
			double r = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2 ,2));
			// 두 지점 사이의 거리
			
			if(x1==x2&&y1==y2&&r1==r2)
				count[i]=-1;
			else {
				if(r1+r2==r)
					count[i]=1;
				else if(r1+r2<r)
					count[i]=0;
				else{
					if(Math.abs(r1-r2)==r)
						count[i]=1;
					else if(Math.abs(r1-r2)>r)
						count[i]=0;
					else
						count[i]=2;
				}
			}
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(count[i]);
		}
	}

}
