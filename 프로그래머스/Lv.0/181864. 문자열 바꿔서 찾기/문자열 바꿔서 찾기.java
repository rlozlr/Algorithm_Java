class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        for(int i = 0; i < myString.length(); i++) {
            if(myString.substring(i,(i+1)).equals("A")) {
                str += "B";
            } else if (myString.substring(i,(i+1)).equals("B")) {
                str += "A";
            }
        }
        
        if(str.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}