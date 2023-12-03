class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if( n % 2 == 1) {
            answer = odd(n);
        } else {
            answer = even(n);
        }
        
        return answer;
    }
    
    // 홀수
    public int odd(int n) {
        int k = 0;
        
        for( int i = 1; i <= n; i++) {
            if( i % 2 == 1) {
                k += i;
            }
        }
        return k;
    }
    
    // 짝수
    public int even(int n) {
        int k = 0;
        
        for( int i = 1; i <= n; i++) {
            if( i % 2 == 0) {
                k += i*i;
            }
        }
        return k;
    }
}