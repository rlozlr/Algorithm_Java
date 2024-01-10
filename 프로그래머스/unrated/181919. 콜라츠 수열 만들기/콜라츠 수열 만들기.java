class Solution {
    public int[] solution(int n) {
        String str = String.valueOf(n) + ",";
        int len = 0;
        while ( n > 1) {
            if(n % 2 == 0) {
                n = n / 2;
                str += String.valueOf(n) + ",";
            } else {
                n = 3 * n + 1;
                str += String.valueOf(n) + ",";
            }
            len++;
        } 
        String[] strArr = (str.split(","));
                           
        int[] answer = new int [strArr.length];
        int idx = 0;
        for(String s : strArr) {
            answer[idx++] = Integer.parseInt(s);
        }
         

        return answer;
    }
}