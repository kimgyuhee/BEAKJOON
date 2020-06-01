package beakjoon10;

import java.util.Scanner;
public class Hw_4153 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		//int max=0;
		String s="";
		/*********************************
		do {
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();

			if(a==0&&b==0&&c==0)
				break;


			max=(a<b ? b:a);
			max=(max<c ? c:max);

			if(max==a) {
				if(check(c,b,a))
					s=s+"right"+"\n";
				else
					s=s+"wrong"+"\n";
			}else if(max==b) {
				if(check(a,c,b))
					s=s+"right"+"\n";
				else
					s=s+"wrong"+"\n";
			}else {
				if(check(a,b,c))
					s=s+"right"+"\n";
				else
					s=s+"wrong"+"\n";
			}

		}while(!(a==0&&b==0&&c==0));


		System.out.println(s);
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
	}

	public static boolean check(int a, int b, int c) {
		if(Math.sqrt(a*a+b*b)==c)
			return true;
		else
			return false;
	}
}

***************************************/
		
		do {
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			if(a==0&&b==0&&c==0)
				break;
			int a2=(int)Math.pow(a, 2);
			int b2=(int)Math.pow(b, 2);
			int c2=(int)Math.pow(c, 2);
			
			if(a2==b2+c2)
				s=s+"right"+"\n";
			else if(b2==a2+c2)
				s=s+"right"+"\n";
			else if(c2==a2+b2)
				s=s+"right"+"\n";
			else
				s=s+"wrong"+"\n";
			
		}while(!(a==0&&b==0&&c==0));
		
		System.out.println(s);
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
	}
}
