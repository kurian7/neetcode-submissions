class Solution {
    private List<List<Integer>> res ;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
      res = new ArrayList<List<Integer>>();
      List<Integer> cur = new ArrayList<>();
      backtrack(nums, cur, target, 0, 0);
      return res;  
    }
    private void backtrack(int[] nums, List<Integer> cur, int target, int total, int i){
        if(total == target){
            res.add(new ArrayList(cur));
            return;
        }
        if(total>target || i>=nums.length)
         return ;
        cur.add(nums[i]);
        backtrack(nums, cur, target, total+nums[i], i);
        cur.remove(cur.size()-1);
        backtrack(nums, cur, target, total, i+1);
    }
}
