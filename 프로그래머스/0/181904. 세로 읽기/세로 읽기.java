class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if (i == (c - 1)){
                answer += String.valueOf(my_string.charAt(c - 1));
                c += m;                
            }
        }
        return answer;
    }
}