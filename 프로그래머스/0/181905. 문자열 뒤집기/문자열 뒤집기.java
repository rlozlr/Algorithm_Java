class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int idx = 0;
        String revStr = new StringBuilder(my_string.substring(s, e+1)).reverse().toString();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i <= e) {
                answer += revStr.substring(idx, idx+1);
                idx++;
            } else {
                answer += my_string.substring(i, i+1);
            }
        }
        return answer;
    }
}