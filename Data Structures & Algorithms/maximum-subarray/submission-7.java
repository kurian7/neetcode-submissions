class Solution {
    public int maxSubArray(int[] nums) {
        int mSum = nums[0] ;
        int cSum =0;
        for(int n : nums){
            if(cSum < 0)
              cSum =0;
            cSum += n;
            mSum = Math.max(mSum,cSum); 
        }
        return mSum;
    }
}
