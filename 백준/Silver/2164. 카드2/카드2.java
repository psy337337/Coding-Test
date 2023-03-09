import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n,num;
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList();
		
		n = sc.nextInt();
		for(int i = 1 ; i < n+1; i++) {
			queue.add(i);
		}
		for(int i = 1; i < n ; i++) {
			queue.poll();
			num = queue.poll();
			queue.add(num);
		}
		System.out.println(queue.poll());
		
	}
}