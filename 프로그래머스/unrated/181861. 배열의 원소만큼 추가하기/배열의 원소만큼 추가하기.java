import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            cnt += arr[i];
        }
        
        int[] answer = new int [cnt];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            int repeat = arr[i];
            while (repeat > 0) {
                answer[idx++] = arr[i];
                repeat--;
            }
        }
        
        return answer;
    }
}