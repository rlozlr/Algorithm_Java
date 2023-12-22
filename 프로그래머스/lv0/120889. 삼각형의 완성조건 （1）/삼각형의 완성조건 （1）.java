class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        for(int i = 0; i < sides.length-1; i++) {
            for(int j = i+1; j < sides.length; j++) {
                if(sides[i] > sides[j]) {
                    int tmp = sides[j];
                    sides[j] = sides[i];
                    sides[i] = tmp;
                }
            }
        }
        if(sides[2] < sides[0]+sides[1]) {
            answer = 1;
        }
        return answer;
    }
}
