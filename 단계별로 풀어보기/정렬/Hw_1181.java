package beakjoon14;

import java.util.Scanner;
public class Hw_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();

		//<> list = new ArrayList<>[];
		String[] word = new String[N];
		int[] word_length = new int[N];
		int count=0; // 중복되는 단어 수
		for(int i=0; i<N; i++) {
			word[i]=sc.next();
			word_length[i]=word[i].length();
		}

		String word_temp="";
		int length_temp=0;
		for(int i=0; i<N-1; i++) {
			for(int j=i; j<N; j++) {
				if(word[i].length()>word[j].length()) {
					word_temp=word[i];
					word[i]=word[j];
					word[j]=word_temp;

					length_temp=word_length[i];
					word_length[i]=word_length[j];
					word_length[j]=length_temp;
				}else if(word[i].length()==word[j].length()){
					if(word[i].compareTo(word[j])>0) {
						word_temp=word[i];
						word[i]=word[j];
						word[j]=word_temp;
					}
				}

			}
		}
		
		String end=word[N-1];
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<=i+1; j++) {
				if(end==word[j]) {
					System.out.println(count);
					for(int a=0; a<N-count; a++) {
						System.out.println(word[a]);
					}
					return;
				}
					
				if(word[i].equals(word[j])) {
					for(int k=j;k<N;k++) {
						word[k-1]=word[k];
					}
					count++;
				}
			}
		}
		
	}

}
