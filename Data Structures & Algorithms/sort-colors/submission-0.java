class Solution {
    public void sortColors(int[] nums) {
        int l =0, r=nums.length-1, i=0;
           while(i<=r){
            if(nums[i] == 0 ){
                swap(i,l,nums);
                l++;
            }
            else if(nums[i]==2){
                nums[i] = nums[r];
                swap(i,r, nums);
                nums[r] = 2;
                r--;
                i--;
            } 
            i++;
        }
    }
    private void swap(int i, int k, int[] nums){
        int temp = nums[i];
        nums[i] =nums[k];
        nums[k] = temp;
    }
}