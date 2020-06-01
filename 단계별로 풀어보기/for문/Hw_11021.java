package beakjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hw_11021 {
	public static void main(String[] args) {
		/************************
		Scanner scr = new Scanner(System.in);
		int a,b;
		int n=scr.nextInt();
		int[] array= new int[n];
		
		for(int i=0; i<n; i++) {
			do {
				a=scr.nextInt();
				b=scr.nextInt();
			}while(!(a>0&&b<10&&b>0&&b<10));
			array[i]=a+b;
		}
		
		for(int i=0; i<n;i++) {
			System.out.println("Case #"+(i+1)+": "+array[i]);
		}
		**************************/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String[] temp=br.readLine().split(" ");
				System.out.print("Case #"+(i+1)+": ");bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
				bw.flush();
			}
			bw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
