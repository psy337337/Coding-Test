import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	public static void main(String args[]) throws IOException {
		int n,x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> h = new PriorityQueue<>();
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ; i++) {
			x = Integer.parseInt(br.readLine());
			if(x == 0)
				System.out.println((h.size() == 0) ? 0 :h.poll());
			else
				h.offer(x);
		}
	}
}
