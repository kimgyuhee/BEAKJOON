package beakjoon8;

import java.util.Scanner;
public class Hw_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			s=sc.next();
		}while(!(s.length()>=2&&s.length()<=15));
		s=s.toUpperCase();
		
		int time=0;
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'A': case 'B': case 'C':
				time+=3;
				continue;
			case 'D': case 'E': case 'F':
				time+=4;
				continue;
			case 'G': case 'H': case 'I':
				time+=5;
				continue;
			case 'J': case 'K': case 'L':
				time+=6;
				continue;
			case 'M': case 'N': case 'O':
				time+=7;
				continue;
			case 'P': case 'Q': case 'R': case 'S':
				time+=8;
				continue;
			case 'T': case 'U': case 'V':
				time+=9;
				continue;
			case 'W': case 'X': case 'Y': case 'Z':
				time+=10;
				continue;
				
			}
		}
		System.out.println(time);
	}

}
