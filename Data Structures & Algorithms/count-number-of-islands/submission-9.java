class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0)
         return 0;
        int n = grid.length;
        int m = grid[0].length;
        int island = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] =='1' && !visited[i][j]){
                  bfs(grid, i, j, visited);
                  island++;
                }
            }
        } 
        return island;
    }
    private void bfs(char[][] grid, int r, int c, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r,c});
        visited[r][c] = true;
        int[][] dir = {{1,0},{-1,0}, {0,1}, {0,-1}};
        while(!q.isEmpty()){
            int[] co = q.poll();
            for(int [] d :dir){
                int dr = d[0]+co[0];
                int dc = d[1]+co[1];
                if(dr>=0 && dc>=0 && dr<grid.length && dc <grid[0].length && grid[dr][dc]=='1' && !visited[dr][dc]){
                    q.offer(new int[]{dr,dc});
                    visited[dr][dc] = true;
                }
            }
        }
        
    }
}
