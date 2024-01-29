

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] arr = new int [26];
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
			char c = str.charAt(0);			
			arr[c-'a']++;
		}
		
		String ans = "";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 5) {
				char ccc = (char)(i+97);
				ans += ccc;
			}
		}
		
		if(ans.length() == 0) {
			ans = "PREDAJA";
		}
		
		System.out.println(ans);		
	}	
}
