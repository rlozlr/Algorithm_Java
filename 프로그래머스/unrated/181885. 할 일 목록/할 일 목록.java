class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // answer length 구하기
        int cnt = 0;
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                cnt++;
            }
        }
        
        String[] answer = new String [cnt];
        int idx = 0;
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }
        return answer;
    }
}