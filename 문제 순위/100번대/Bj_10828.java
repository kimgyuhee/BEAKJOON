package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class Bj_10828 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> myStack = new Stack<Integer>();
		
		int N = input.nextInt();
		
		String s = input.nextLine();
		
		for(int i=0; i<N; i++) {
			s=input.nextLine();
			
			switch(s) {
				case "pop":
					if(myStack.empty())
						System.out.println(-1);
					else
						System.out.println(myStack.pop());
					break;
				case "size":
					System.out.println(myStack.size());
					break;
				case "empty":
					if(myStack.empty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "top":
					if(myStack.empty())
						System.out.println(-1);
					else
						System.out.println(myStack.peek());
					break;
				default :
					String[] p = new String[2];
					p=s.split(" ");
					myStack.push(Integer.parseInt(p[1]));
			}
			
					
		}
	}
}
