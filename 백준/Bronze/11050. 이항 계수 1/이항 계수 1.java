import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k;
		int arr[][];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		arr = new int[n+1][n+1];
		for(int i =0 ;i < n+1;i++) {
			arr[i][i] = 1;
			arr[i][0] = 1;
			arr[i][1] = i;
		}
		for(int i = 2;i<n+1;i++) {
			for(int j = 2; j < i; j++) {
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
		}
		System.out.println(arr[n][k]);

	}

}
