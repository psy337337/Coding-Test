import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		int n;
		String bk;
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			bk = sc.next();
			s.clear();
			for(int j = 0; j < bk.length();j++) {
				if(bk.charAt(j)=='(')
					s.push(1);
				else {
					if(s.isEmpty()) {
						s.push(1);
						break;
					}
					s.pop();
				}
			}
			if(s.isEmpty())			
				System.out.println("YES");
			else
				System.out.println("NO");			
		}
	}
}
