class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [arr.length];
        for(int[] query : queries) {
            int num1 = query[0];
            int num2 = query[1];
            for(int i = 0; i < arr.length; i++) {
                if( i >= query[0] && i <= query[1]) {
                    arr[i] += 1;
                }
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}