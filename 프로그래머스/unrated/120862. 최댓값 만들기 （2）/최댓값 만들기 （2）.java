class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++ ) {
                if(numbers[i] > numbers[j]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        int maxIdx = numbers[numbers.length-1] * numbers[numbers.length-2];
        int minIdx = numbers[0] * numbers[1];
        return answer = (maxIdx > minIdx) ? maxIdx : minIdx;
    }
}