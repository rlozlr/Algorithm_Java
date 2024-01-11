class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                strArr[i] = "1";
                cnt++;
            }
        }
        String[] answer = new String [strArr.length - cnt];
        int idx = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("1")) {
                answer[idx++] = strArr[i];
            }
        }
        return answer;
    }
}