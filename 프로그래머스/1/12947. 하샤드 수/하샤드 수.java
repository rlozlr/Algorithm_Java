class Solution {
    public boolean solution(int x) {
        String[] str = String.valueOf(x).split("");
        int num = 0;
        for(int i = 0; i < str.length; i ++) {
            num += Integer.parseInt(str[i]);
        }
        
        boolean answer = (x % num == 0) ? true : false;
        return answer;
    }
}