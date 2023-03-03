import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException  {
		int n,k,max = -10000000;
		long[] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new long[n+k+1];
		st = new StringTokenizer(br.readLine());
		for(int i = k+1 ; i < n+k+1 ; i++) { 
			arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
			if(i-k >= k)
				max = Math.max((int)(arr[i]-arr[i-k]),max);
		}

		System.out.println(max);
	}

}
