import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, cnt;
	static int[][] miro;
	static boolean[][] visit;
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String args[]) throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		miro = new int[n][m];
		visit = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			line = st.nextToken();
			for(int j =0; j < m; j++)
				miro[i][j] = line.charAt(j)-'0';
		}
		bfs(0,0);
		System.out.println(miro[n-1][m-1]);
		
	}
	static void bfs(int x, int y) {
		Queue<int[]>q = new LinkedList<>();
		q.offer(new int[] {x,y});
		visit[x][y] = true;
		while(!q.isEmpty()) {
			int[] now = q.poll();
			for(int i = 0; i < 4;i++) {
				int nx = now[0]+dx[i];
				int ny = now[1]+dy[i];
				if(nx<0 || ny<0 || nx>n-1 || ny >m-1) continue;
				if((!visit[nx][ny])&&(miro[nx][ny] != 0)) {
					visit[nx][ny]=true;
					miro[nx][ny] = miro[now[0]][now[1]]+1;
					q.add(new int[] {nx, ny});
				}
			}
		}
		
	}
	
}
