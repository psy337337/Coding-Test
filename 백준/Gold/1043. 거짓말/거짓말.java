import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
	static boolean arrTrue[];
	static int arr[];
	public static void main(String[] args) throws IOException{
		int n, m, num, a,b;
		
		ArrayList<Integer>[] patty;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arrTrue = new boolean[n+1];
		arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		num = Integer.parseInt(st.nextToken());
		for(int i=1;i<=n; i++)
			arr[i] = i;
		for(int i = 0; i < num; i++)
			arrTrue[Integer.parseInt(st.nextToken())] = true;
		patty = new ArrayList[m];
		for(int i=0; i<m; i++)
			patty[i] = new ArrayList<>();
		
		///////
		
		
		//3번째줄
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			
			a = Integer.parseInt(st.nextToken());
			patty[i].add(a);
			for(int j = 1; j < num; j++) {
				b = Integer.parseInt(st.nextToken());
				patty[i].add(b);
				add(a, b);
			}
			
		}
		
		for(int i=1; i<arrTrue.length; i++) {
			if(arrTrue[i]) {
				arrTrue[find(i)] = true;
			}
		}
		
		
		b=0;
		for(int i=0; i<m; i++) {
			if(patty[i].size() > 0) {
				a = find(patty[i].get(0));
				if(!arrTrue[a]) b++;
			}
		}
		System.out.println(b);
		
	}

	private static boolean add(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) {
			arr[b] = a;
			return true;
		}
		return false;
		
	}
	private static int find(int a) {
		if(arr[a]==a)
			return a;
		else
			return arr[a] = find(arr[a]);
			
	}
}
