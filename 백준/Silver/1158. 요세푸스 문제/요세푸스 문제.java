import java.util.Scanner;

public class Main {
	public static boolean[] arr;
	public static int n;
	public static void main(String args[]) {
		int k,index, cnt = 1;
		int num = 1;
		boolean [] output;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		arr = new boolean[n];
		output = new boolean[n];
		
		k = sc.nextInt();
		index = k-1;
		System.out.print("<"+k);
		arr[index] = true;
		// 0 1 2 3 4 5 6
		while(num != n) {
			if(cnt != k) {
				cnt += 1;
				index = checkFalse(index+1);
			}
			else {
				index = checkFalse(index+1);
				System.out.print(", "+(index+1));
				arr[index] = true;
				cnt = 1;
				num += 1;
			}
		}
		System.out.println(">");

	}
	private static int checkFalse(int index) {
		if(index == n)
			index = 0;
		
		if(arr[index] == false) {
			return index;
		}
		else {
			index = checkFalse(index+1);
		}
		return index;
	}
}