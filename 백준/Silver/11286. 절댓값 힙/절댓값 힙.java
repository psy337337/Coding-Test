import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n,x,out;
		PriorityQueue<int[]> h = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 만일 2차원 배열의 첫 번째 원소가 같다면, 2번째 원소를 기준으로 내림차순 정렬한다.
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				// 2차원 배열의 첫 번째 원소를 기준으로 오름차순 정렬한다.
				return Integer.compare(o1[1], o2[1]);
			}
		});
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			if(x != 0) {
				h.offer(new int[] {x,Math.abs(x)});
				continue;
			}
			out = (h.size() == 0) ? 0 :h.poll()[0]; 
			System.out.println(out);
		}
	}
}