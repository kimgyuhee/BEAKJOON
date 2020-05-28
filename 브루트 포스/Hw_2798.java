package beakjoon13;

import java.util.Scanner;
public class Hw_2798 {

	private static int[] cards;
	private static int N;
	private static int M;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		
		cards = new int[N];
		
		for(int i=0; i<N; i++) {
			cards[i]=sc.nextInt();
		}
		
		System.out.println(solution(0,0,0));
		/*************************************
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[] card = new int[N];
		
		for(int i=0; i<N; i++) {
			card[i]=sc.nextInt();
		}
		
		int sum=0;
		int result=0;
		int min=100;
		
		5 6 7 	-> 18
		5 6 8	-> 19
		5 6 9	-> 20
		5 7 8	-> 20
		5 7 9	-> 21
		5 8 9	-> 22
		6 7 8	-> 21
		6 7 9	-> 22
		6 8 9	-> 23
		7 8 9	-> 24

		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++){
					System.out.println(card[i]+" "+card[j]+" "+card[k]+"->"+(card[i]+card[j]+card[k]));
					sum=card[i]+card[j]+card[k];
					if(sum>M)
						continue;
					else if(sum==M) {
						result=sum;
						break;
					}
					else {
						if(min>M-sum) {
							System.out.println("*****"+min+"*****");
							min=M-sum;
							result=sum;
						}
					}
						
				}
			}
		}
		
		System.out.println(result);
		*****************************************/
	}

	private static int solution(int sum, int idx, int cnt) {
		if(cnt==3) {
			return sum > M ? 0 : sum;
		}
		if(idx>=N) {
			return 0;
		}
		int max=0;
		for(int i=idx; i<N; i++) {
			max=Math.max(max, solution(sum+cards[i], i+1, cnt+1));
		}
		return max;
	}
	

}
