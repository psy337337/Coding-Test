import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static class Node{
        private int end,time;

        public Node(int end, int time) {
            this.end = end;
            this.time = time;
        }
    }
	
	public static void main(String[] args) {
		int n,m,max=987654321;
		long[] arr;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ArrayList<ArrayList<Node>> a = new ArrayList<>();
		
		arr = new long[n+1];
		for(int i = 0; i <= n; i++) {
			a.add(new ArrayList<>());
			arr[i] = max;
		}
		arr[1] = 0;
		
		for(int i = 0; i < m; i++)
			a.get(sc.nextInt()).add(new Node(sc.nextInt(),sc.nextInt()));
		
		for(int z = 1; z < n; z++) {
			for (int j = 1; j <= n; j++) {
				for(Node i:a.get(j)) {
					if(arr[j]==max)
						break;
					 if (arr[i.end] > arr[j] + i.time) {
	                     arr[i.end] = arr[j] + i.time;
	                 }
				}
			}
		}
		for(int j = 1; j <= n; j++) {
			
			for(Node i:a.get(j)) {
				if(arr[j]==max)
					break;
				if(arr[i.end] > arr[j]+i.time) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		for(int j = 2; j <= n; j++) {
			if(arr[j]==max)
				System.out.println(-1);
			else
				System.out.println(arr[j]);
		}
		
	}
}
