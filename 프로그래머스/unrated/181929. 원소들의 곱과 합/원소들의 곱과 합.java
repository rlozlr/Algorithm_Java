class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0, mul = 1, sq = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        if(Math.pow(sum, 2) > mul) {
            answer = 1;
        }
        return answer;
    }
}