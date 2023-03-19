import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
		String str;
		int out = 0, tmp=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		Stack<String> s =new Stack<String>();
		while(st.hasMoreElements()) {
			s.add(st.nextToken());
		}
		
		while(!s.isEmpty()) {
			tmp = 0;
			st = new StringTokenizer(s.pop(),"+");
			while(st.hasMoreElements()) {
				tmp += Integer.parseInt(st.nextToken());
			}
			out = (!s.isEmpty() ? out-tmp : out+tmp);
			
		}
		System.out.println(out);
	}
}
