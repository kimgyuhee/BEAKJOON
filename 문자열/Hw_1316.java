package beakjoon8;
import java.util.Scanner;
public class Hw_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		int gc=0;
		for(int i=0; i<count; i++) {
			String s=sc.next();
			s.matches("a-z+");
		}
	}

}
