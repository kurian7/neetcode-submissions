class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0, r= Arrays.stream(piles).max().getAsInt();
        int k =r;
        while(l<=r){
            int mid = l+(r-l)/2;
            long  t =0;
            for(int i:piles){
              t+=Math.ceil((double)i/mid);
            }
              if(t<=h){
                k=mid;
                r = mid-1;
              }
              else
                {
                    l=mid+1;
                }
        }
        return k;
    }
}
