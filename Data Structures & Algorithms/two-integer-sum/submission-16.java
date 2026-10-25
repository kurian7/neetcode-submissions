class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length; i++){
           mp.put(nums[i],i);
        }
        int[] result = new int[2];
        for(int i=0;i<nums.length; i++){
            int diff = target-nums[i];
            if(mp.containsKey(diff)){
                if(i!=mp.get(diff)){
                result[1] = mp.get(diff);
                result[0] = i;
                break;
                }
            }
        }
        return result;
    }
}
