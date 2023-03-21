import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		long a, b;
		long out;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		a = sc.nextLong();
		b = sc.nextLong();
		
		out = gcd(a,b);
		for(int i = 0; i < out; i++)
			sb.append('1');
		System.out.println(sb);
	}
	static long gcd(long a, long b) {
		if(a%b != 0)
			return gcd(b,a%b);
		else
			return b;
	}

}
