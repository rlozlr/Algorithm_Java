class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++) {
            String numCheck = str.substring(i, i+1);
            if(Integer.parseInt(numCheck) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}