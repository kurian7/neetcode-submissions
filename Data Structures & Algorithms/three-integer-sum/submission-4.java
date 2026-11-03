class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(i>0 && nums[i] == nums[i-1])
             continue;
            int l=i+1;
            int r=nums.length-1;
            int target = -nums[i];
            while(l<r){
            if(nums[r] + nums[l] == target){
                res.add(Arrays.asList(nums[i], nums[l], nums[r]));
            
            while(l<r && nums[l]==nums[l+1]){
                l++;
            }
            while(l<r && nums[r] == nums[r-1]){
                r--;
            }
            l++;
            r--;
            }
            else if(nums[r]+nums[l] <target)
              l++;
            else 
              r--;  
            }
        }
        return res;
    }
}
