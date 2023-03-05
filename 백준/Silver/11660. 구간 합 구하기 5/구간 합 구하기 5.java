import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		int n,m,a,b,c,d;
		int[][] arr;
		String[] split;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();


		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+2][n+2];
		split = new String[n];
		for(int i = 1; i < n+1 ; i ++) {
			split = br.readLine().split(" ");
			arr[i][n] = Integer.parseInt(split[n-1]);
			for(int j = n-1; j > 0 ; j--)
				arr[i][j] = Integer.parseInt(split[j-1])+arr[i][j+1];
		}
		
		for(int i = 1; i < m+1 ; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			n = 0;
			for(int j = a; j < c+1 ; j++)
				n += arr[j][b]-arr[j][d+1];
			sb.append(n+"\n");
		}
		System.out.println(sb);
	}
}
