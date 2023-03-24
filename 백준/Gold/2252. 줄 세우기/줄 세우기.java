import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m, num;
		int arr[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i = 0; i < n+1; i++)
			a.add(new ArrayList<>());
		
		arr = new int[n+1];
		for(int i =0 ;i < m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			a.get(s).add(e);
			arr[e]++;
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i<=n;i++) {
			if(arr[i]==0)
				q.add(i);
		}
		while(!q.isEmpty()) {
			num = q.poll();
			System.out.print(num+" ");
			for(int i:a.get(num)) {
				if(--arr[i]==0)
					q.add(i);
			}
		}
	}

}
