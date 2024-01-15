class Solution {
    public int[] solution(long n) {
        String len = n + "";
        int[] answer = new int [len.length()];
        
        for(int i = 0 ; i < len.length(); i++) {
            answer[i] = (int) (n % 10);
            n = n / 10;
        }
        return answer;
    }
}