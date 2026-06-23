class Solution {
    public int longestConsecutive(int[] nums) {
        int longest =0;
        Set<Integer> st = new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i:nums){
            if(!st.contains(i-1)){
                int length = 0;
                while(st.contains(i+length)){
                    length += 1;
                } 
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
