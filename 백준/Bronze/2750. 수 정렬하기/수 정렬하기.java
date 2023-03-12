import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		int n,num;
		int[] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					num = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = num;
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}
