import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		int input;
		double max = 0;
		double arr[];
		double sum = 0;
		StringTokenizer st;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.nextLine();
		
		st = new StringTokenizer(sc.nextLine());
		arr = new double[input];
		
		for(int i = 0; i < input; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			
			max = Math.max(arr[i], max);
		}
		
		for(int i = 0; i < input; i++) {
			arr[i] = (arr[i]/max)*100;
			sum += arr[i];
		}
		System.out.println(sum/input);
		
	}

}
