class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int cnt = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            while(cnt < n) {
                answer += my_string.charAt(i);
                cnt ++;
            }
            cnt = 0;
        }
        return answer;
    }
}