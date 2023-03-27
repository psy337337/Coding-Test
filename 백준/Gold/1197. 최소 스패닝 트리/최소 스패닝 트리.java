import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int[] arr;
	public static void main(String[] args) {
		int v, e,num=0;
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();
		
		arr = new int[v+1];
		for(int i = 1; i <= v; i++)
			arr[i] = i;
		
		ArrayList<int []> a = new ArrayList<>();
		
		for(int i = 0; i < e; i++)
			a.add(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()});
		
		a.sort(Comparator.comparingInt(o -> o[2]));
		
		
		for(int i = 0; i < e; i++) {
			if(add(a.get(i)[0],a.get(i)[1])) {
				num+=a.get(i)[2];
			}
		}
		System.out.println(num);
	}
	private static boolean add(int a, int b) {
		a = find(a);
		b = find(b);
		
		if(a!=b) {
			arr[b] = a;
			return true;
		}
		return false;	
	}
	private static int find(int a) {
		if(arr[a]==a)
			return a;
		else
			return arr[a] = find(arr[a]);
			
	}
}
