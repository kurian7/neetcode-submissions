class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            mp.put(nums[i], i);
        }
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                if(i!=mp.get(target-nums[i])){
                result[0] = i;
                result[1] = mp.get(target-nums[i]);
                break;
                }
            }
        }
        return result;
    }
}
