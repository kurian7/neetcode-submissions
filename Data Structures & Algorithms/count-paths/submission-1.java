class Solution {
    public int uniquePaths(int m, int n) {
        int[] ro = new int[n];
        Arrays.fill(ro, 1);

         for(int  i= 0; i<m-1 ; i++) {
          int[] nr = new int[n];
           nr[n-1] = 1; 
          for(int j = n-2; j>=0 ; j--){
            nr[j] = ro[j] + nr[j+1];
          }
          ro = nr;
        }
       return ro[0];
    }
}
