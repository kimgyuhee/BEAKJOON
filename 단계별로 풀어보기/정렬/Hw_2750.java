package beakjoon14;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Hw_2750 {
	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	static void selectionSort(int[] a) {
		 for (int i = 0; i < a.length - 1; ++i) {
			 int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서     
			 swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다       
		}
	}
	
	static int findMin(int[] a, int start) {
		int minValue=a[start];
		int minIndex=start;
		for(int i=start+1; i<a.length; i++) {
			if(a[i]<minValue) {
				minValue=a[i];
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(); // 갯수 출력
		
		// 숫자 입력받기
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int start=0; start<a.length-1; start++) {
			int minValue=a[start];
			int minIndex=start;
			for(int i=start+1; i<a.length; i++) {
				if(a[i]<minValue) {
					minValue=a[i];
					minIndex=i;
				}
			}
			int temp=a[start];
			a[start]=a[minIndex];
			a[minIndex]=temp;
		}
		for(int i=0; i<N; i++) {
			System.out.println(a[i]);
		}
		/***************************
		 시간 복잡도가 O(n2)인 정렬들 : 버블정렬, 삽입정렬, 선택정렬
		int N= sc.nextInt();
		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i]=sc.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int i=0; i<N; i++) {
			System.out.println(array[i]);
		}
		****************************/
	}
}
