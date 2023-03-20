import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		int max, cnt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> input = new ArrayList();
		boolean arr[];
		
		while(true) {
			input.add(Integer.parseInt(br.readLine()));
			if(input.get(input.size()-1) == 0)
				break;
		}
		max = Collections.max(input);
		arr = new boolean[2*max+1];
		arr[1] = true;
		for(int i = 2; i < Math.sqrt(2*max)+1; i++) {
			if(arr[i]) 
				continue;
			for(int j = i*i; j < 2*max+1; j=j+i)
				arr[j] = true;
		}
		
		for(int i = 0; i < input.size()-1;i++) {
			cnt = 0;
			for(int j = input.get(i)+1; j < 2*input.get(i)+1;j++) {
				if(!arr[j])
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}
