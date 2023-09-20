import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(char cha : a.toCharArray()) {
            if(Character.isLowerCase(cha)) {
                answer += Character.toUpperCase(cha);
            }else {
                answer += Character.toLowerCase(cha);
            }
        }
        
        System.out.println(answer);
        
        
    }
}