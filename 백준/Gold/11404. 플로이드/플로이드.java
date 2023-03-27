import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int n,m, max = 987654321;
		int[][] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		
		
		//초기화
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = max;
				if(i==j)
					arr[i][j] = 0;
			}
		}
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			arr[s][e] = Math.min(time, arr[s][e]);
			
		}
		
		//플로이드 워셜
		for(int k = 1; k <= n; k++) {
			for(int s = 1; s <= n; s++) {
				for(int e = 1; e <= n; e++) {
					arr[s][e] = Math.min(arr[s][e], arr[s][k]+arr[k][e]);
				}
			}
		}
		
		//출력
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n; j++) {
				if(arr[i][j] == max)
					arr[i][j] = 0;
					
				sb.append(arr[i][j] + " ");
				
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
	
}
