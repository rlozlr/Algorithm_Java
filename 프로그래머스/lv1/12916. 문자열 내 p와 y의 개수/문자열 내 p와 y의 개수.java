class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( c == 'P') {
                p++;
            }
            if ( c == 'Y') {
                y++;
            }
        }
            
        if( p != y) {
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);
        
        return answer;
    }
}