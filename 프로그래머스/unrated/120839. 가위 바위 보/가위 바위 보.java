class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 가위 = 2, 바위 = 0, 보 = 5
        for(int i = 0; i < rsp.length(); i++) {
            char rspChar = rsp.charAt(i);
            switch (rspChar) {
                case '2' : answer += "0"; break;
                case '0' : answer += "5"; break;
                case '5' : answer += "2"; break;
            }
        }
        return answer;
    }
}