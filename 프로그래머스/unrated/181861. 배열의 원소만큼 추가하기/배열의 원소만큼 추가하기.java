import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int cnt = 0;
            while (cnt < arr[i]) {
                answer.add(arr[i]);
                cnt++;
            }
        }
        return answer;
    }
}