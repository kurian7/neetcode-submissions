class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> t =new HashSet<>();
        for(int i:nums){
            if(t.contains(i))
              return true;
            t.add(i);  
        }
        return false;
    }
}