import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n, x, num, max=0,cnt = 0;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		arr = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			arr[i] = arr[i-1]+sc.nextInt();
			if(i >= x) {
				num = arr[i]-arr[i-x];
				if(max < num) {
					cnt = 1;
					max = num;
				}else if(max == num) {
					cnt++;
				}
			}
		}
		if(max == 0)
			System.out.println("SAD");
		else
			System.out.println(max+"\n"+cnt);
		

	}

}
