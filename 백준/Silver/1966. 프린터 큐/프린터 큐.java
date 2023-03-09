import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n,m,index,num,cnt = 0;
		Integer[] arr;
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		
		n = sc.nextInt();
		for (int i = 0 ; i < n ; i++) {
			q.clear();
			m = sc.nextInt();
			index = sc.nextInt()+1;
			arr = new Integer[m];
			for(int j = 0; j < m; j++) {
				num = sc.nextInt();
				q.add(num);
				arr[j] = num;
			}
			
			Arrays.sort(arr,Collections.reverseOrder());
			cnt = 0;
			while(q.size()!=0) {
				
				index =(--index == -1)?q.size()-1:index;
				
				if(q.peek() < arr[cnt]) {
					q.add(q.remove());
					continue;
				}
				
				q.remove();
				cnt++;
				if(index==0)
					break;
				
			}
			System.out.println(cnt);
		}
	}
}
