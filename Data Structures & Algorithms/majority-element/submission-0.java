class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int maxC = 0, res =0;
        for( int i:nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
            if(mp.get(i) > maxC)
             {maxC = mp.get(i);
              res = i;
             }

        }
        return res;
       
    }
}