import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] strArr = my_string.split("");
        Arrays.sort(strArr);
        for(int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }
        return answer;
    }
}