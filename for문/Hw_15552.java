package beakjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/***************
BufferedReader / BufferWriter
버퍼를 이용해서 읽고 쓰는 함수입니다.
입출력의 효율이 비교할수 없을 정도로 좋아진다.

****************/
public class Hw_15552 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String[] temp=br.readLine().split(" ");
				bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
