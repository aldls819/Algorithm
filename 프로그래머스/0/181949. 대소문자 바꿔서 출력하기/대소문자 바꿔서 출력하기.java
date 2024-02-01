import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                str += c;
            }
            else {
                c = Character.toUpperCase(c);
                str += c;
            }
            
        }
        System.out.println(str);
        
    }
}