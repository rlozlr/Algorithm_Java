import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        String[] strArr = str.split("");
        Long[] lonArr = new Long[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            lonArr[i] = Long.parseLong(strArr[i]);
        }
        
        Arrays.sort(lonArr);
        str = "";
        for(int i = lonArr.length-1; i >= 0; i--) {
            str += lonArr[i] + "";
        }
        
        answer = Long.parseLong(str);

        return answer;
    }
}