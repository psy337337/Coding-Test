import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int dept[];
	static int parent[];
	static ArrayList<ArrayList<Integer>> tree;
	public static void main(String[] args) throws IOException{
		int n,m,a,b;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		//트리 인접 리스트 생성
		tree = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) {
			tree.add(new ArrayList<>());
		}
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a =Integer.parseInt(st.nextToken());
			b =Integer.parseInt(st.nextToken());
			tree.get(a).add(b);
			tree.get(b).add(a);
		}
		
		//깊이 구하기
		dept = new int[n+1];
		parent = new int[n+1];
		dfs(1,0,-1);
		
		m = Integer.parseInt(br.readLine());
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a =Integer.parseInt(st.nextToken());
			b =Integer.parseInt(st.nextToken());
			
			int adep = dept[a];
			int bdep = dept[b];
			while(adep > bdep) {
				a = parent[a];
				adep--;
			}
			while(adep < bdep) {
				b = parent[b];
				bdep--;
			}
			while(a!=b) {
				a = parent[a];
				b = parent[b];
			}
			System.out.println(a);
		}
		
	}

	private static void dfs(int index, int dep, int par) {
		dept[index] = dep;
		parent[index] = par;
		
		for (int i : tree.get(index)) {
			if(i != par)
				dfs(i,dep+1,index);
		}
		
	}

}
