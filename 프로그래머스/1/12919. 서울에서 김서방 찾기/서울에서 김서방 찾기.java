class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for(String str : seoul) {
            if (str.equals("Kim")) {
                answer = "김서방은 " + String.valueOf(cnt) + "에 있다";
            }
            cnt ++;
        }
        return answer;
    }
}