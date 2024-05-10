
import java.util.Scanner;

public class Bj_15686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] a = new int[N][N];
		int[][] home = new int[2 * N][2];
		int[][] c = new int[13][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int home_count = 0;
		int c_count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == 1) {
					home[home_count][0] = i + 1;
					home[home_count][1] = j + 1;
					home_count++;

				} else if (a[i][j] == 2) {
					c[c_count][0] = i + 1;
					c[c_count][1] = j + 1;
					c_count++;
				}

			}
		}
		System.out.println("집의 좌표들 ");
		for (int i = 0; i < home_count; i++) {
			System.out.println("( " + home[i][0] + " ," + home[i][1] + " )");
		}

		System.out.println("치킨집 좌표들 ");
		for (int i = 0; i < c_count; i++) {
			System.out.println("( " + c[i][0] + " ," + c[i][1] + " )");
		}

		int[] min = new int[home_count];

		for (int i = 0; i < c_count; i++) {
			int m = 10;
			for (int j = 0; j < home_count; j++) {
				int road = Math.abs(c[i][0] - home[j][0]) + Math.abs(c[i][1] - home[j][1]);
				if (m > road) {
					m = road;
				}
			}
			System.out.println(m);
			min[i] = m;
		}

		int sum = 0;
		for (int i = 0; i < home_count; i++) {
			sum += min[i];
		}
		System.out.println("치킨 로드의 거리는 ? " + sum);

	}

}
