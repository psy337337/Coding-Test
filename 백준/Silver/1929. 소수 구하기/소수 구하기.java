import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		int m, n;
		boolean[] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		arr = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		for(int i = 2; i < Math.sqrt(n)+1; i++) {
			if(arr[i]) 
				continue;
			for(int j = i*i; j < n+1; j=j+i)
				arr[j] = true;
		}
		for(int i = m; i < n+1; i++) {
			if(!arr[i])
				System.out.println(i);
		}
	}

}