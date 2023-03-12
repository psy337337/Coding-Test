import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		int n, f = 0, e, x,cnt = 0, num;
		int[] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		x = Integer.parseInt(br.readLine());
		e = n-1;
		if(n == 1 && x == arr[0]) {
			System.out.println(1);
			return;
		}
		while(f != e){
			num = arr[f]+arr[e];
			if(num == x) {
				cnt++;
				f++;
				continue;
			}
			else if(num < x)
				f++;
			else
				e--;
				
		}
		System.out.println(cnt);
	}
}
