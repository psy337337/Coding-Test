import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int arr[];
	public static void main(String[] args) throws IOException{
		int n, m;
		boolean isIn;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		for(int i = 0; i < n+1; i++)
			arr[i]=i;
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken()) == 0) {
				add(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}else {
				isIn = checkSame(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
				if(isIn) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
	private static boolean checkSame(int a, int b) {
		if(find(a)==find(b)) return true;
		return false;
		
	}
	private static void add(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b)
			arr[b] = a;
		
	}
	private static int find(int a) {
		if(arr[a]==a)
			return a;
		else
			return arr[a] = find(arr[a]);
			
	}
}
