class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0, right =0,length =0;
        Set<Character> st = new HashSet<>();
        for(char c: s.toCharArray()){
             while(st.contains(c)){
                st.remove(s.charAt(left));
                left++;
            }
         
         st.add(c);
         right++;
         length = Math.max(length, right-left);
        }
        return length;
    }
}
