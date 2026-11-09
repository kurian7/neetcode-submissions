class Solution {
    private Set<List<Integer>> pac;
    private Set<List<Integer>> atl;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int col = heights[0].length;
        pac = new HashSet<>();
        atl = new HashSet<>();

        for(int i=0; i<col;i++){
            dfs(0,i, pac, heights[0][i], heights);
            dfs(rows-1, i, atl, heights[rows-1][i], heights);
        }
        for(int i=0; i<rows;i++){
            dfs(i,0, pac, heights[i][0], heights);
            dfs(i, col-1, atl, heights[i][col-1], heights);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<rows;i++){
            for(int j=0;j<col; j++){
                if(pac.contains(Arrays.asList(i,j)) && atl.contains(Arrays.asList(i,j))){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
  private void dfs(int r, int c, Set<List<Integer>> visit, int prevH, int[][] heights){
    if(visit.contains(Arrays.asList(r,c)) || r<0 || c<0 || r== heights.length || c==heights[0].length || heights[r][c] < prevH){
        return;
    }
    visit.add(Arrays.asList(r,c));
    dfs(r+1, c, visit, heights[r][c], heights);
    dfs(r-1, c, visit, heights[r][c], heights);
    dfs(r, c+1, visit, heights[r][c], heights);
    dfs(r, c-1, visit, heights[r][c], heights);
  }  
}
