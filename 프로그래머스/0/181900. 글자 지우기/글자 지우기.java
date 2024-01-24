class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        for(int idx : indices) {
            strArr[idx] = "";
        }
        
        for(String str : strArr) {
            answer += str;
        }
        
        return answer;
    }
}