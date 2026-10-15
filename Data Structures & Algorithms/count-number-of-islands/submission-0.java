class Solution {
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }
    private void dfs(char[][] grid, int x, int y){
        visited[x][y] = true;

        for(int d=0; d<4; d++){
            int nx= x+dx[d];
            int ny = y+dy[d];
            if(nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length ){
                continue;
            }
            if(visited[nx][ny] || grid[nx][ny]== '0'){
                continue;
            }
            dfs(grid,nx,ny);
        } 
    }
}
