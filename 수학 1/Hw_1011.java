package beakjoon9;

import java.util.Scanner;
public class Hw_1011 {
	public static void main(String[] args) {
		/*****************************
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] a = new int[T];
		
		for(int i=0; i<T ; i++) {
			int x=sc.nextInt(); // start
			int y=sc.nextInt(); // end
			int distance = y-x;
			int count=1;
			int k=0; //광년
			if(distance==1)
				a[i]=1;
			else {
				while(x<y) {
					System.out.println("x -> "+x+" y -> "+y+" k -> "+k);
					if(y-1==k+x||y-1==(k-1)+x||y-1==(k+1)+x) {
						count++;
						break;
					}
					else {
						if(y-x<k) {
							count++;
							break;
						}
						
						if(y-1>=x+k) {
	
							k++;
							x=x+k;
							count++;
						}
					}
				}
				
				a[i]=count;
				
			}
			
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(a[i]);
		}
		
		********************************/
		
		Scanner in = new Scanner(System.in); 
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) { 
			int X = in.nextInt();
			int Y = in.nextInt();
			int distance = Y - X;	// 거리 
		 	int max = (int)Math.sqrt(distance);	// 소수점 버림 
		 	if(max == Math.sqrt(distance)) { 
		 		System.out.println(max * 2 - 1); 
		 		} 
		 	else if(distance <= max * max + max) { 
		 		System.out.println(max * 2); 
		 		} 
		 	else {
		 		System.out.println(max * 2 + 1);
		 		}
		 } 

	}

}
