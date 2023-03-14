import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[];
	static ArrayList<Integer>[] a;
	public static void main(String args[])throws IOException{
		int n,m, s,e;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		a = new ArrayList[n+1];
		
		
		for(int i = 1; i < n+1 ; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			a[s].add(e);
			a[e].add(s);
			
		}
		int count = 0;
		for(int i = 1; i < n+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
		
	}
	private static void DFS(int v) {
		if(visited[v])
			return;
		visited[v] = true;
		for(int i : a[v]) {
			if(!visited[i])
				DFS(i);
		}
		
	}
}
