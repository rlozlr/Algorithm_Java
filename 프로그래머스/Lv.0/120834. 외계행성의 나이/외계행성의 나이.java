class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = String.valueOf(age);
        //String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] alpha = new String [10];
        for(int i = 0; i < alpha.length; i++) {
            alpha[i] = Character.toString((char)('a' + i));
        }
        
        
        
        String[] ageArr = ageStr.split("");
        for(int i = 0; i < ageArr.length; i++) {
            answer += alpha[Integer.parseInt(ageArr[i])];   
        }
        return answer;
    }
}