class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String str3 = str1 + str2;
        int c = 2 * a * b;
        
        if(Integer.parseInt(str3) > c) {
            answer = Integer.parseInt(str3);
            return answer;
        } else {
            answer = c;
            return answer;
        }
    }
}