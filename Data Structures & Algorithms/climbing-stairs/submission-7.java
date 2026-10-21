class Solution {
    public int climbStairs(int n) {
        if(n<=2)
         return n;
        int l=1;
        int r=2;
        for(int i=2;i<n;i++){
            int k= l+r;
            l=r;
            r=k;
        } 
        return r;
    }
}
