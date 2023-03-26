import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, m, k, x, num, max= 300001,min = max;
		int arr[]; 
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		arr = new int[n+1];
		for(int i = 0; i <= n; i++) {
			a.add(new ArrayList<>());
			arr[i] = max;
		}
		arr[x] = 0;
		
		for(int i = 0; i < m; i++)
			a.get(sc.nextInt()).add(sc.nextInt());
		
		
		
		Queue<Integer> q = new LinkedList<>();
		q.add(x);
		while(!q.isEmpty()) {
			num = q.poll();
			for(int i:a.get(num)) {
				if(arr[i] == max) {
					arr[i] = arr[num]+1;
					q.add(i);
				}
			}			
		}
		num = 0;
		for(int i = 1; i < n+1; i++) {
			if(arr[i] == k) {
				System.out.println(i);
				num++;
			}
		}
		if(num == 0)
			System.out.println(-1);
	}
}
