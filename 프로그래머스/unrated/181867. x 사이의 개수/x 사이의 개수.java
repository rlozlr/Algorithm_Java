class Solution {
    public int[] solution(String myString) {
        if(myString.charAt(myString.length() - 1) == 'x') {
           myString = myString.substring(0, myString.length() - 1) + "x ";
        }
        String[] strArr = myString.split("x");

        int[] answer = new int [strArr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strArr[i].length();
        }
        if(strArr[strArr.length - 1].equals(" ")){
            answer[answer.length -1] = 0;
        }
        return answer;
    }
}