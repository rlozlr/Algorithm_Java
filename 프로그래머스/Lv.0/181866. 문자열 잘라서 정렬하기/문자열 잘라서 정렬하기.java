import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x+");
        String[] answer;

        // 모두 'x'인 경우
        boolean allX = true;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                allX = false;
                break;
            }
        }
        
        if (allX) {
            answer = new String[]{""};
        } else {
            answer = Arrays.copyOf(str, str.length);

            // 빈 문자열 제거
            answer = Arrays.stream(answer)
                           .filter(s -> !s.isEmpty())
                           .toArray(String[]::new);

            Arrays.sort(answer);
        }
        return answer;
    }
}