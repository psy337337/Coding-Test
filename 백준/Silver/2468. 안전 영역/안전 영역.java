import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[][];
	static int[][] arr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int n;
	public static void main(String args[]) throws IOException {
		int max=0, output = 0, cnt=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n+2][n+2];
		arr = new int[n+2][n+2];
		
//		for(int i = 0; i < n+2; i++)
//			Arrays.fill(visited[i], true);

		for(int i = 1; i < n+1 ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
//				visited[i][j] = false;
				if(arr[i][j] > max)
					max = arr[i][j];
				
			}
		}

		for(int h = 0; h < max; h++) {
			visited = new boolean[n+1][n+1];
			cnt = 0;
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(!visited[i][j] && arr[i][j] > h)
						cnt += dfs(i,j,h);
				}
			}
			output = Math.max(cnt, output);
		}
		System.out.println(output);
	}
	private static int dfs(int x, int y, int h) {
		int cnt = 0;
		visited[x][y] = true;
		for(int i = 0; i < 4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
//			System.out.println(nx);
//			System.out.println(ny);
//			System.out.println(arr[nx][ny]>h);
//			여기 왜 안됨 ??????? 왜 저 if문을 넘어가서 cnt쪽으로 가는거임????? false인데????????
			if(nx==0 || ny==0 || nx>n || ny >n) continue;
			if((!visited[nx][ny])&&(arr[nx][ny] > h)) {
				dfs(nx,ny,h);
			}
//			진짜 이해 안되는데 왜 main문에서는 visited[nx][ny]가 접근이 되는데
//			여기서는 안됨
//			System.out.println(visited[nx][ny]);
//			if(visited[nx][ny]) continue;
//			if(arr[nx][ny] > h) dfs(nx,ny,h);
		}
		return 1;
	}
}
