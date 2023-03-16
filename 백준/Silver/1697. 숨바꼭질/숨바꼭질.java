import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n, k, max = 100001, num;
		int[] arr;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		arr = new int[max];
		Queue<Integer>q = new LinkedList<>();
		
		
		q.offer(n);
		num = n;
		arr[n] = 1;
		while(!q.isEmpty()) {
			num = q.poll();
			if(num == k)
				break;
			int[] a = new int[] {num-1,num+1,2*num};
			for(int i = 0; i < 3; i++) {
				if(a[i] < max && a[i] >= 0) {
					if(arr[a[i]]==0 ) {
						arr[a[i]] = arr[num]+1;
						q.add(a[i]);
					}
				}
					
			}
		}
		System.out.println(arr[k]-1);
	}
}
