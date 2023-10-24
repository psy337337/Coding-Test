import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		st.nextToken();
		for(int i=2 ; i < n+1; i++) {
			int choose = Integer.parseInt(st.nextToken());
			list.add(list.size()-choose, i);
		}
		
		for(Integer i : list)
		    System.out.print(i+" ");
		
	}
}