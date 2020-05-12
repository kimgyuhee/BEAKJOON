package beakjoon8;
import java.util.Scanner;
public class Hw_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		int gc=count;
		for(int i=0; i<count; i++) {
			String s=sc.next();
			for(int a=0; a<s.length()-1; a++) {
				if(s.indexOf(s.charAt(a),a+1)!=-1) {
					if(s.indexOf(s.charAt(a))!=s.indexOf(s.charAt(a+1))) {
						gc--;
						break;
					}
				}
			}
			
		}
		
		System.out.println(gc);
	}

}
