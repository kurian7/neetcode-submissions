class Solution {
    public int rob(int[] nums) {
        int mx =Math.max(nums[0],Math.max(robHelp(nums, 0, nums.length-1), robHelp(nums, 1, nums.length)));
        return mx;
    }
    private int robHelp(int[] nums, int i, int n){
        int r1=0, r2 =0;
        for(;i<n;i++){
            int rob = Math.max(r1+nums[i], r2);
            r1 = r2;
            r2 = rob;
        }
        return r2;
    }
}
