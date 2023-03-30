import java.util.Scanner;

public class Main {
	static int arr[];
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+2];
		arr[1] = 1;
		arr[2] = 2;		
		System.out.println(make(n));
	}

	private static int make(int n) {
		if(arr[n] != 0)
			return arr[n];
		return arr[n] = (make(n-1)+make(n-2))%10007;
		
	}
}
