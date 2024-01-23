class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arrStr = my_string.split("");
        for(int i = 0; i < arrStr.length; i++) {
            if(!answer.contains(arrStr[i])) {
                answer += arrStr[i];
            }
        }
        return answer;
    }
}