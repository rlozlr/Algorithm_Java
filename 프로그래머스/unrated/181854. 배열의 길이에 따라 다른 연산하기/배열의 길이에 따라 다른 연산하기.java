class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int [arr.length];
        if(arr.length % 2 == 1 ) {   // arr의 길이 홀수
            for(int i = 0; i < answer.length; i++) {
                if(i % 2 == 0 || i == 0) {
                    answer[i] = arr[i] + n;
                } else {
                     answer[i] = arr[i];
                }
            }
        } else {     // arr의 길이 짝수
            if(arr.length % 2 == 0) {
                for(int i = 0; i < answer.length; i++) {
                    if(i % 2 == 1 && i != 0) {
                        answer [i] = arr[i] + n;
                    } else {
                        answer[i] = arr[i];
                    }
                }
            }      
        }
        return answer;
    }
}