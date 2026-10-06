class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (backtrack(board, word, i, j, 0)) return true;
            }
        }
        return false;
        
    }

    private boolean backtrack(char[][] board, String word, int x, int y, int k){
        if(x<0 || y<0 || x>=board.length || y>=board[0].length){
            return false;
        }

        if(board[x][y] != word.charAt(k)){
            return false;
        }

        if(k==word.length()-1) return true;

        char temp=board[x][y];
        board[x][y] = '#';

        for(int i=0; i<4; i++){
            if(backtrack(board, word, x+dx[i], y+dy[i], k+1)){
                board[x][y] = temp;
                return true;
            }
        }

        board[x][y]=temp;
        return false;

    }
}
