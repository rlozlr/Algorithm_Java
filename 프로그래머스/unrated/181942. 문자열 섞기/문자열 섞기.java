class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
            char first = str1.charAt(i);
            char second = str2.charAt(i);
            answer += String.valueOf(first)+ String.valueOf(second);
        }
        return answer;
    }
}