class Solution {
    boolean[][] visited;
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        visited = new boolean[grid.length][grid[0].length];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    max = Math.max(max, bfs(i,j,grid));
                }
            }
        }
        
        return max;


    }

    private int bfs(int x, int y, int[][] grid){
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {x,y});
        visited[x][y] = true;
        int area = 0;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            area++;

            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx<0 || ny <0 || nx>=grid.length || ny>=grid[0].length) continue;
                if(visited[nx][ny] || grid[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                q.offer(new int[] {nx,ny});
            }
        }
        return area;
    }
}
