class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0)
         return 0;
        int r = grid.length;
        int c = grid[0].length;
        int island = 0;
        boolean[][] visited = new boolean[r][c];
        for(int i =0;i< r; i++){
            for (int j=0; j< c; j++){
                if(grid[i][j] == '1' && !visited[i][j])
                  {bfs(grid,i,j,visited);
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
      while(!q.isEmpty()){
        int[][] dir ={{0,1}, {1,0},{0,-1},{-1,0}};
        int[]co = q.poll();
        for(int[] d : dir){
            int dr = co[0]+d[0];
            int dc = co[1]+d[1];
            if(dr >=0 && dc >= 0 && dr < grid.length && dc< grid[0].length && grid[dr][dc] =='1' && !visited[dr][dc]){
                q.offer(new int[]{dr,dc});
                visited[dr][dc]=true;
            }
        }
      }  
    }
}
