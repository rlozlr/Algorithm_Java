class Solution {
    public int solution(int num) {
        int answer = 0;
        long numLong = (long) num;
        if(numLong == 1) {
            return 0;
        }else {
           while (numLong != 1) {
               if (answer > 500) {
                   return -1;
               } 
               if(numLong % 2 == 0) {
                   numLong = numLong / 2;
               } else {
                   numLong = (numLong * 3) + 1;
               }
               answer++;
           }
        }
        return answer;
    }
}