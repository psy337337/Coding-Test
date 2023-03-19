import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] last;
		int[] base;
		int x = 0;
		int max = 0;
		int count;
		while(true) {
			arr.add(sc.nextInt());
			if(arr.get(x)>123456)
				arr.remove(x);
			if(arr.get(x)!=null && max < arr.get(x))
				max = arr.get(x);
			if(arr.get(x)==0)
				break;
			x++;
		}
		base = new int[max*2+1];
		last = new int[arr.size()];
		for(int i = 2; i < base.length; i++) {
			base[i] = i;
		}
		for(int i = 2; i <= Math.sqrt(max*2);i++) {
			if(base[i]==0)
				continue;
			for(int j = i+i; j <= max*2; j+=i)
				base[j] = 0;
		}
		for(int i = 0; i < arr.size(); i++) {
			for(int j = arr.get(i)+1; j <= arr.get(i)*2;j++) {
				if(base[j] != 0)
					last[i]++;
			}
		}
		for(int i = 0; i < last.length-1; i++)
			System.out.println(last[i]);
	}
}