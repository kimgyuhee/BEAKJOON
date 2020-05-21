package beakjoon10;

import java.util.Scanner;
public class Hw_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis(); //시작하는 시점 계산

		Scanner sc = new Scanner(System.in);
		int[][] spot = new int[3][2];
		int x=0;
		int y=0;
		for(int i=0; i<3 ; i++) {
			spot[i][0]=sc.nextInt();
			spot[i][1]=sc.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			int count=0;
			for(int j=0; j<3; j++) {
				if(spot[i][0]==spot[j][0])
					count++;		
			}
			if(count==1)
				x=spot[i][0];
		}
		
		for(int i=0; i<3; i++) {
			int count=0;
			for(int j=0; j<3; j++) {
				if(spot[i][1]==spot[j][1])
					count++;		
			}
			if(count==1)
				y=spot[i][1];
		}
		
		System.out.println(x+" "+y);
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
	}

}
