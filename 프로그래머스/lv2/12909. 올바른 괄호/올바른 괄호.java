class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { 
                count++;
            } else {
                count--;   
            }
            if (count < 0) {
                answer = false;
            }
        }
        
        if(count != 0) {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
