import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int n,k, first=0, end, max=0, num = 0;
		int[] arr;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		end = k-1;
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i < k) {
				max += arr[i];
				num += arr[i];
			}
		}	
		
		while(first!=n) {
			num -= arr[first++];
			if(++end == n)
				end = 0;
			num += arr[end];
			if(num > max)
				max = num;
			
		}
		System.out.println(max);
	}
}