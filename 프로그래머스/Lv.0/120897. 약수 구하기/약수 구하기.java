class Solution {
    public int[] solution(int n) {
        String str = "";
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                str += String.valueOf(i) +",";
            }
        }
        String [] arr = str.split(",");
        int[] answer = new int [arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}