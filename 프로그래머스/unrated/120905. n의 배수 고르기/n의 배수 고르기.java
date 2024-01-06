class Solution {
    public int[] solution(int n, int[] numlist) {
        int idx = 0 ;  // answer index
        int cnt = 0 ;   // numlist의 n의 배수 수 개수
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
               cnt++;
            }
        }
        int[] answer = new int [cnt];
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[idx] = numlist[i];
                idx++;
            }
        }
        
        return answer;
    }
}