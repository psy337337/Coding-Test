import java.util.*;
public class Main {
	public static void main(String args[]) {
		int[] score;
		int max = 0;
		int num = 0;
		double last = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			score = new int[sc.nextInt()];
		}while(score.length>1000);
		for(int i = 0; i < score.length; i++) {
			do {
				score[i] = sc.nextInt();
			}while(score[i] > 100 && score[i] < 0);
			if(score[i] == 0){
				num++;
			}
		}
		if(num == score.length) {
			do {
				score[score.length-1] = sc.nextInt();
			}while(score[score.length] == 0);
		}
		for(int i = 0; i < score.length; i++) {
			if(max < score[i])
				max = score[i];
		}
		for(int i = 0; i < score.length; i++) {
			last += (score[i]/(double)max)*100;
		}
		System.out.println(last/score.length);
	}
}
