class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    danger(board, i, j);
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    private void danger(int[][] board, int x, int y) {
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                try {
                    if(board[x + i][y + j] == 0) {
                        board[x + i][y + j] = 2;
                    }
                } catch (Exception e) {
                    
                }
            }
        }
    }
}