class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] num = binomial.split(" ");
        String op = num[1];
        
        switch(op) {
            case "+" : 
                answer = Integer.parseInt(num[0]) + Integer.parseInt(num[2]); 
                break;
            case "-" : 
                answer = Integer.parseInt(num[0]) - Integer.parseInt(num[2]); 
                break;
            case "*" : 
                answer = Integer.parseInt(num[0]) * Integer.parseInt(num[2]); 
                break;
        }
        return answer;
    }
}