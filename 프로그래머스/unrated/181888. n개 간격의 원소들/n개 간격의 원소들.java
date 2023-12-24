class Solution {
    public int[] solution(int[] num_list, int n) {
        int leng = 0;
        if(num_list.length % n == 0 ) {
            leng = num_list.length / n;
        } else {
            leng = num_list.length / n + 1;
        }
        
        int[] answer = new int[leng];
        int idx = 0;
        for(int i = 0 ; i < num_list.length; i++) {
            if ( idx < num_list.length) {
                answer[i] = num_list[idx];
                idx += n;   
            }
        }
        return answer;
    }
}