class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 6 == 0) {
            answer = n / 6;
        } else {
            for(int i = 1; ;i++) {
                if( i % n == 0 && i % 6 == 0) {
                    answer = i / 6;
                    break;
                }
            }
        }
        return answer;
    }
}