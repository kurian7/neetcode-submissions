class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
         return nums[0];
        if(nums.length ==2)
         return Math.max(nums[0], nums[1]);        
        int rob = Math.max(hRobHelper(nums, 0, nums.length - 1), 
         hRobHelper(nums, 1, nums.length));
       return rob;
    }
   private int hRobHelper(int[] nums, int start, int end)
   {
    int r1 =0, r2 =0;
    for(int i= start; i<end; i++){
        int rob = Math.max(r1 + nums[i], r2);
        r1 = r2;
        r2 = rob;
    }
    return r2;
   }
}
