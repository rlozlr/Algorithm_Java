class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // answer 길이 구하기
        int leng = 0;
        for(int i = 0; i < intervals.length; i++) {
            leng += intervals[i][1] - intervals[i][0]+1; 
        }
        
        // answer 길이 선언
        int[] answer = new int [leng];
        
        // 
        int idx = 0;
        for(int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }
}