import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		int n,k, index = -1, output = 0;
		int coin[];
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		coin= new int[n];
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
			if(coin[i] <= k) {
				index = i;
			}
		}
		
		while(k != 0) {
			if(coin[index] <= k ) {
				output++;
				k -= coin[index]; 
			}else
				index--;
		}
		System.out.println(output);
	}

}
