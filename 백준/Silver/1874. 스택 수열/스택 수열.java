import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static int cnt = 1;
	static int index = 0;
	static LinkedList<Integer> li;
	public static void main (String[] args) {
		int n, num;
		boolean isLast = false;
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		n = sc.nextInt();
		
		li = new LinkedList<Integer>();
		li.add(0);
		
		
		for(int i = 0; i < n; i++) {
			num = sc.nextInt();
			while(true) {
				if(num > li.get(index)) {
					if(isLast) {
						System.out.println("NO");
						return;
					}
					push();
					sb.append("+\n");
				}
				else {
					pop();
					sb.append("-\n");
					break;
				}
			}
			if(num == n)
				isLast=true;
		}
		System.out.println(sb);
		
	}
	public static void pop() {
		li.removeLast();
		index--;
	}
	public static void push() {
		li.add(cnt++);
		index++;
	}
}
