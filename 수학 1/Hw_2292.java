package beakjoon9;

import java.util.Scanner;
public class Hw_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int p1=0;
		int p2=1;
		int room=1;
		if(N==1)
			System.out.println(room);
		else {
			for(int i=2; ;i++) {
				if(N>=(6*p1+2)&&N<=(6*p2+1)) {
					room=i;
					System.out.println(room);
					break;
				}else {
					p1=p2;
					p2=p2+i;
				}
			}
		}
		
		//System.out.println("p1 -> "+p1+"\np2 -> "+p2);
		
		/*************
		 # 6의 배수
		 1(1)						-> 1	/ 1
		 2[6*0+2]~7[6*1+1](6) 		-> 2	/ 2,3,4,5,6,7
		 8[6*1+2]~19[6*3+1](12)		-> 3	/ 8,9,10,11,12,13,14,15,16,17,18,19
		 20[6*3+2]~37[6*6+1](18)	-> 4
		 38[6*6+2]~61[6*10+1](24)	-> 5 
		*************/
	}

}
