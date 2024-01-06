class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [5];
        for(int i = 0; i < num_list.length; i++) {
            for(int j = i; j < num_list.length; j++) {
                if(num_list[i] > num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        System.arraycopy(num_list, 0, answer, 0, answer.length);
        return answer;
    }
}
