class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = 0;
        for(int i = 0; i < numLog.length-1; i++) {
            if (numLog[i+1] == numLog.length-1) {
                num = 0 - numLog[i];
            } else {
                num = numLog[i+1] - numLog[i];
            }
            switch(num) {
                case 1 : answer += "w"; break;
                case -1 : answer += "s"; break;
                case 10 : answer += "d"; break;
                case -10 : answer += "a"; break;
            }
        }
        return answer;
    }
}