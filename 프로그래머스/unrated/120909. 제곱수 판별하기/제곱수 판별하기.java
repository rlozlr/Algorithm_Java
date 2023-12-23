class Solution {
    public int solution(int n) {
        int answer = 2;
        if (Math.pow(n, 0.5) % 1 == 0) {
            answer = 1;
        }
        return answer;
    }
}