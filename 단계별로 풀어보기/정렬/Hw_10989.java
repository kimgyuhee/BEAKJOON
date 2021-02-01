package beakjoon14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Hw_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(br.readLine());
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i]=Integer.valueOf(br.readLine());
		}
		
		countingSort(a);
		for(int i : a) {
			System.out.println(i);
		}
	}
	
	private static void countingSort(int[] a) {
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		for(int i : a) {
			Integer index = treeMap.get(i);
			if(index==null)
				index=0;
			treeMap.put(i, index+1);
		}
		
		int ii=0;
		for(int i : treeMap.keySet()) {
			for(int j=0; j<treeMap.get(i); j++) {
				a[ii++]=i;
			}
		}
	}
}
