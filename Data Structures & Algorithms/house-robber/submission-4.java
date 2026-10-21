class Solution {
    public int rob(int[] nums) {
        int r1=0, r2 =0;
        for(int i:nums){
            int rob = Math.max(i+r1, r2);
            r1 = r2;
            r2 =rob;
        }
        return r2;
    }
}
