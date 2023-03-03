import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		int arr[];
		int cnt, len;
		
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		arr = new int[len+1];
		cnt = sc.nextInt();
		
		
		arr[1] = sc.nextInt();
		for(int i = 2; i < len+1; i++) {
			arr[i] = sc.nextInt()+arr[i-1];
 		}
		
		for(int i = 0; i < cnt ; i++) {
			System.out.println(-arr[sc.nextInt()-1]+arr[sc.nextInt()]);
		}
	}
}