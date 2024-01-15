class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = 0;
        for(int i = 1; i<= n; i++) {
            if(n / i == i && n % i == 0) {
                answer = (long) Math.pow(i+1, 2);
                break;
            }
        }
        return answer;
    }
}