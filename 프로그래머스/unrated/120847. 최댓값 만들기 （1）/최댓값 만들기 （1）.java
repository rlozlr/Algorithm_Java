class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if( numbers[i] > numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}