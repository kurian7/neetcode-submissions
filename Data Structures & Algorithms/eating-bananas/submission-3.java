class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int min =r;
        while(l<=r){
            int mid=l+(r-l)/2;
            long t=0;
            for(int i:piles){
                t+= Math.ceil((double)i/mid);
            }
            if(t<=h){
                min = mid;
                r=mid-1;
            }
            else
              l =mid+1;
        }
        return min;
    }
}
