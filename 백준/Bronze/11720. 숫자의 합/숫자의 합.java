import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String input;
		int cnt;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		cnt = sc.nextInt();
		input = sc.next();
		
		for(int i = 0; i < cnt; i++) {
			sum += input.charAt(i)-48;
		}
		System.out.println(sum);
	}

}
