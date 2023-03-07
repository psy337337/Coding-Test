import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int checkSecret;
	static int[] nums;
	static int[] myArr;
	public static void main(String args[]) throws IOException {
		int s,p, index = 1, i;
		String str, temp;
		String[] dna = {"A","C","G","T"};
		nums = new int[4];
		myArr = new int[4];
		
		checkSecret=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		s = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		str=br.readLine();
		
		st = new StringTokenizer(br.readLine());
		for(i = 0; i < 4; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			if(nums[i] == 0) checkSecret++;
		}
		s = 0;
		
		for(i =0 ;i <p; i++) { 
			Add(str.charAt(i));
		}
		if(checkSecret == 4) s++;
		

		while(str.length() > p+index-1) {
			Add(str.charAt(p+index-1));
			Remove(str.charAt(index-1));
			if(checkSecret == 4) s++;
			index++;
		}
		System.out.println(s);
		
	}
	private static void Add(char c) {
		int i = -1;
		switch(c) {
		case 'A' :
			i = 0;
			break;
		case 'C' :
			i = 1;
			break;
		case 'G' :
			i = 2;
			break;
		case 'T' :
			i = 3;
			break;
		}
		myArr[i]++;
		if(myArr[i] == nums[i]) checkSecret++;
	}
	
	private static void Remove(char c) {
		int i = -1;
		switch(c) {
		case 'A' :
			i = 0;
			break;
		case 'C' :
			i = 1;
			break;
		case 'G' :
			i = 2;
			break;
		case 'T' :
			i = 3;
			break;
		}
		if(myArr[i] == nums[i])
			checkSecret--;
		myArr[i]--;
	}
}