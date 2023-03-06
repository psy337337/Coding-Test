import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n,m, start=0,end,sum=0,num;
		int[] arr;
        
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		sc.nextLine();
		
		arr = new int[n];
		arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
		
		Arrays.sort(arr);
		end = n-1;
		while(end != start) {
			num = arr[start]+arr[end]; 
			if(num == m) {
				sum++;
				start++;
			}
			else if(num < m) {
				start++;
			}
			else {
				end--;
			}
		}
		System.out.println(sum);
	}
}
