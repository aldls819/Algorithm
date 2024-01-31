

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t=1; t<=tc; t++) {
			
			int num = sc.nextInt();
			int [] arr = new int [num];
			double sum = 0;
			double avg = 0;
			
			for(int i=0 ; i<num; i++) {	
				int temp = sc.nextInt();
				arr[i] = temp;
				sum += arr[i];
			}
			
			avg = sum / num;
					
			double cnt = 0;
			
			for(int i=0; i<num; i++) {
				if(arr[i] > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n", (cnt/num)*100);
		}
			
	}	
}
