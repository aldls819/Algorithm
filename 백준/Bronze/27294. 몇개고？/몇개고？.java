

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int drink = sc.nextInt();
		int riceNum = 0;
		
		if(time <= 11 || time > 16 || drink == 1) {
			riceNum = 280;
		}
		else {
			riceNum = 320;
		}
		
		
		System.out.println(riceNum);		
	}	
}
