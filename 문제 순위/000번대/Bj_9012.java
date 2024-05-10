
import java.util.Scanner;

public class Bj_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s;
		for (int i = 0; i < T; i++) {
			s = sc.next();
			if (s.length() % 2 != 0 || s.charAt(0) == ')') {// || s.charAt(0)==')' || s.charAt(s.length()-1)=='(') {
				// System.out.println("���ڼ� :"+s.length());
				System.out.println("NO");
				continue;

			} else {
				byte[] b = s.getBytes();
				int left = 0;
				int right = 0;
				for (int j = 0; j < s.length(); j++) {
					if (b[j] == '(')
						left++;
					else {
						right++;
						if (left == right) {
							left = 0;
							right = 0;
						}
					}

					if (right > left) {
						left = -1;
						continue;
					}
				}

				if (left == right)
					System.out.println("YES");
				else
					System.out.println("NO");
			}

		}
	}
}
