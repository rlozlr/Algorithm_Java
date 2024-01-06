class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        
        if(is_prefix.length() > my_string.length()) {
            answer = 0;
        } else {
            String str = my_string.substring(my_string.length() - is_prefix.length());
            if(!str.equals(is_prefix)) {
                answer = 0;
            }
        }
        return answer;
    }
}