class Solution {
    public int rob(int[] nums) {    
        int rob = Math.max(nums[0],Math.max(hRobHelper(nums, 0, nums.length - 1), 
         hRobHelper(nums, 1, nums.length)));
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
