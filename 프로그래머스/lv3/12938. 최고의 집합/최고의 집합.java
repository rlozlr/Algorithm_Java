class Solution {
    public int[] solution(int n, int s) {
        // n = 집합의 개수
        
        // 존재하지 않을 때
        if(n > s) { 
            return new int[] {-1};
        }
        
        int[] answer = new int[n];
        
        int idx = 0;
        while(n > 0){
            // 나머지가 0이면 몫이 / 나머지가 있으면 나머지가 num으로 
            int num = s / n;
            answer[idx++] = num;
            s -= num;   // s = 4
            n--;
        }
        return answer;
    }
}