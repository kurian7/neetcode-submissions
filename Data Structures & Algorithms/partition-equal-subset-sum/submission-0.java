class Solution {
    public boolean canPartition(int[] nums) {
        int curSum = 0;
        int tot =0;
        for(int num : nums){
            tot+=num;
        }
        if(tot %2 != 0)
         return false;
       return isPartition(curSum, nums, 0, tot/2);
    }

    private boolean isPartition(int cSum, int[] nums, int i, int half){
        if(cSum == half){
            return true;
        }
        else if(cSum > half || i==nums.length){
             return false;
        }
        else{
            return (isPartition(cSum+nums[i], nums, i+1, half) || isPartition(cSum, nums, i+1, half));}
    }
}
