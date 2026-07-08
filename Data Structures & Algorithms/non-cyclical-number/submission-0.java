class Solution {
    private int sum(int n){
        int s =0;
        while(n > 0){
            int x = n%10;
            s+= x*x;
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        Set<Integer> t = new HashSet<>();
          
         while(!t.contains(n))
            {
                t.add(n);
                n = sum(n);
                if(n == 1)
                 return true;
            }
         return false;     
    }
}
