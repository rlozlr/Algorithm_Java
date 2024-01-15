class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        int count  = 0;
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9' ) {
                count ++;
            }    
        }
        
        return answer = count;
    }
}