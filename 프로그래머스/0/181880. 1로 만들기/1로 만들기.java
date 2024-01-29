class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            while(num_list[i] != 1) {
                answer++;
                if(num_list[i] % 2 == 0) {
                    num_list[i] = num_list[i] / 2;
                } else {
                    num_list[i] = (num_list[i] -1) / 2;
                }
            }
        }
        return answer;
    }
}