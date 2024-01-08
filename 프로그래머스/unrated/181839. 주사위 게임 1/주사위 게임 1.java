class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if( a % 2 == 1 && b % 2 == 1) { // 모두 홀수
            answer = (a * a) + (b * b); 
        } else if ((a + b) % 2 == 1) {  // 둘 중 하나 홀수
            answer = 2 * (a + b);
        } else if (a % 2 == 0 && b % 2 == 0) {  // 모두 짝수
            if(a - b > 0) {
                answer = a - b;
            } else {
                answer = (a - b) * -1;
            }
        }
        return answer;
    }
}