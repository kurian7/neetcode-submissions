class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int curSum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i : nums){
          curSum += i;
          int diff = curSum - k;
            res+= mp.getOrDefault(diff, 0);
            mp.put(curSum, mp.getOrDefault(curSum, 0)+1);
        }
        return res;
    }
}