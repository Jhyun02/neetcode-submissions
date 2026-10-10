class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        int[][] dist = new int[n][m];
        int fresh = 0;

        Queue<int[]> q = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});

                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        while(!q.isEmpty()){
            int[] cur = q.poll();

            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx<0 || ny <0 || nx>=n || ny>=m) continue;
                if(grid[nx][ny] !=1) continue;

                grid[nx][ny] = 2;
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                fresh--;

                if(fresh == 0){
                    return dist[nx][ny];
                }
                q.offer(new int[]{nx,ny});
            }
        }
        return -1;

    }
}
