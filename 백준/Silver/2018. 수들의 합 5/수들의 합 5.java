import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, num, sum = 0, a = 0, b = 1;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 3) {
			System.out.println(1);
			return;
		}
		

		arr = new int[n/2+2];
		arr[0] = 0;	
		for(int i = 1; i < arr.length ; i++)
			arr[i] = arr[i-1]+i;
		
		
		while(b < arr.length) {
			num = arr[b]-arr[a];
			if(num < n)
				b++;
			else if (num > n)
				a++;
			else {
				sum++;
				b++;
			}
		}
		
		System.out.println(sum+1);
	}

}