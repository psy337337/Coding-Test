import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		String str;
		int max, num,index = 0;
		int[] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		arr =  str.chars()
			    .map(x -> x - '0')
			    .toArray();
		
		for(int i = 0; i < str.length()-1; i++) {
			max = arr[i];
			index = i;
			for(int j = i+1; j < str.length(); j++) {
				if(max < arr[j]) {
					max = arr[j];
					index = j;
				}
			}
			num = arr[i];
			arr[i] = arr[index];
			arr[index] = num;
		}
		for(int i: arr)
		    System.out.print(i);
	}
}
