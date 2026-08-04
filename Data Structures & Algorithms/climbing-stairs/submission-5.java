class Solution {
    public int climbStairs(int n) {
        if(n<=2) 
          return n;
        int f =1, s= 2;
        int t=0;
        for(int i=2; i<n; i++){
            t = f+s;
            f= s;
            s=t;
        }  
        return t;
    }
}
