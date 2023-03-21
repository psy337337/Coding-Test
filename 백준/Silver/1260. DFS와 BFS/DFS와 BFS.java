import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[];
	static ArrayList<Integer>[] a;
	
	public static void main(String[] args) throws IOException {
		int n, m, v, s, e;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
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
		for(int i=1; i < n+1; i++) 
			Collections.sort(a[i]);
		
		DFS(v);
		System.out.println();
		visited = new boolean[n+1];
		BFS(v);
		
		
	}
	private static void DFS(int v) {
		if(visited[v])
			return;
		visited[v] = true;
		System.out.print(v+" ");
		for(int i : a[v]) {
			if(!visited[i])
				DFS(i);
		}
		
	}
	private static void BFS(int v) {
		int num;
		Queue<Integer>q = new LinkedList();
		q.offer(v);
		visited[v] = true;
		System.out.print(v+" ");
		
		while(!q.isEmpty()) {
			num = q.poll();

			for(int i : a[num]) {
				if(!visited[i]) {
					visited[i] = true;
					System.out.print(i+" ");
					q.offer(i);
				}
			}
		}
	}
}
