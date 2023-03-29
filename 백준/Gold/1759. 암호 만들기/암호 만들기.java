import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static char[] arr;
	static char[] out;
	public static void main(String[] args) throws IOException{
		int l,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new char[c];
		out = new char[l];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < c; i++)
			arr[i] = st.nextToken().charAt(0);
		Arrays.sort(arr);
		
		make(0,0);
		
	}

	private static void make(int index, int start) {
		if(index == out.length) {
			if(isCode())
				System.out.println(String.valueOf(out));
			return;
		}
		
		for(int i = start; i < arr.length;i++) {
			out[index] = arr[i];
			make(index+1,i+1);
		}
		
		
	}

	private static boolean isCode() {
		int a = 0,b = 0;
		
		char mo[] = {'a','e','u','o','i'};
		for(int i = 0; i < out.length; i++) {
			boolean isA = false;
			for(int j = 0; j < mo.length;j++) {
				if(out[i]==mo[j]) {
					a++;
					isA = true;
					break;
				}
			}
			if(!isA)
				b++;
		}
		
		if(a>=1 && b>=2)
			return true;
		return false;
	}
}
