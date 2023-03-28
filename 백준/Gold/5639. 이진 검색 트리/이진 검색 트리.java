import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> tree;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tree = new ArrayList<Integer>();
		while(true) {
			String n = br.readLine();
			if(n==null||n.equals("")) //인풋 더이상 X 
				break;
			tree.add(Integer.parseInt(n));
		}
		
		print(0,tree.size()-1);
	}

	private static void print(int s, int e) {
		if(s > e) //범위 넘을 때
			return;
		//왼쪽 노드 오른쪽 나눠지는 값 찾기
		int mid = s+1; 
		while(mid <= e && tree.get(mid)<tree.get(s))
			mid++;
		
		//나눠지는 부분 각각 다시 재탐색
		print(s+1,mid-1);
		print(mid,e);
		//가장 왼쪽부터 출력됨
		System.out.println(tree.get(s));
		
	}
	

}
