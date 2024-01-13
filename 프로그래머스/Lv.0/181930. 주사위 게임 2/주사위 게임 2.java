class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] numbers = {a, b, c};
        int count = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    count++;
                }
            }
        }
        
        int num1 = 0, num2 = 0, num3 = 0;
        if(count == 0) {
            answer = a + b + c;  
        } else if (count == 3) {
            for(int i = 0; i < numbers.length; i++) {
                num1 += (int) Math.pow(numbers[i], 1);
                num2 += (int) Math.pow(numbers[i], 2);
                num3 += (int) Math.pow(numbers[i], 3);
            }
            answer = num1 * num2 * num3;
        } else {
            for(int i = 0; i < numbers.length; i++) {
                num1 += (int) Math.pow(numbers[i], 1);
                num2 += (int) Math.pow(numbers[i], 2);
            }
            answer = num1  * num2;
        }
        return answer;
    }
}