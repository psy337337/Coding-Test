import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException{
		int n, sum = 0,max=0;
		int arr[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		List<Integer> list = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		Map<Integer, Integer> map = new HashMap();
		for(int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			if(max < map.get(arr[i])) {
				max = map.get(arr[i]);
				list.clear();
				list.add(arr[i]);
			}else if(max == map.get(arr[i])) {
				list.add(arr[i]);
			}
				
		}
		
		
		System.out.println(Math.round((double)sum/n));
		System.out.println(arr[((int)n/2)]);
		
		System.out.println((list.size() == 1)?list.get(0):list.get(1));
		
		System.out.println(arr[n-1]-arr[0]);

	}
}
