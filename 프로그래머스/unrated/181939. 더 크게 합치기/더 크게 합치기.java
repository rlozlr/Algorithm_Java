class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String str3 = str1 + str2;
        String str4 = str2 + str1;
        
        if(Integer.parseInt(str3) > Integer.parseInt(str4)) {
            answer = Integer.parseInt(str3);
            return answer;
        } else {
             answer = Integer.parseInt(str4);
           return answer;
        }

    }
}