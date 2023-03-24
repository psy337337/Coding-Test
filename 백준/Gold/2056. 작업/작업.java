import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,cnt, num;
		int arr[][];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i = 0; i <= n; i++)
			a.add(new ArrayList<>());
		
		arr = new int[n+1][2];
		for(int i =1 ;i <= n; i++) {
			arr[i][1] = sc.nextInt();
			cnt = sc.nextInt();
			for(int j = 0; j < cnt;j++) {
				a.get(sc.nextInt()).add(i);
				arr[i][0]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		int result[] = new int[n+1]; //각 작업 수행하는데 걸리는 시간
		for(int i = 1; i<=n;i++) {
			result[i] = arr[i][1];
			if(arr[i][0]==0)
				q.add(i);
		}
		while(!q.isEmpty()) {
			num = q.poll();
			for(int i:a.get(num)) {
				result[i] = Math.max(result[i], result[num] + arr[i][1]);
				if(--arr[i][0]==0)
					q.add(i);
			}
		}
		num = 0;
		for (int i = 1; i <= n; i++) {
			num = Math.max(num, result[i]);
		}
		System.out.println(num);
	}

}
