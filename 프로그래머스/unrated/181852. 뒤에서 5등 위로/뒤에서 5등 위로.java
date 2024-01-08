class Solution {
    public int[] solution(int[] num_list) {
        for(int i = 0; i < num_list.length-1; i++) {
            for(int j = i+1; j < num_list.length; j++) {
                if(num_list[i] > num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        int[] answer = new int [num_list.length-5];
        System.arraycopy(num_list, 5, answer, 0, answer.length);
        return answer;
    }
}