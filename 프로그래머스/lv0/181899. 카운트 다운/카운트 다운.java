class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int [ start - end_num + 1];
        int idx = 0;
        while ( start >= end_num) {
            answer[idx++] = start;
            start--;
        }
        return answer;
    }
}
