import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		int n;
		int len[][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		len = new int[n+1][3];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int rgb[] = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
			len[i][0] = rgb[0]+Math.min(len[i-1][1], len[i-1][2]);
			len[i][1] = rgb[1]+Math.min(len[i-1][0], len[i-1][2]);
			len[i][2] = rgb[2]+Math.min(len[i-1][0], len[i-1][1]);
		}
		Arrays.sort(len[n]);
		System.out.println(len[n][0]);
	}
}
