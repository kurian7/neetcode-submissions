class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0, r = 0, len =0;
        Set<Character> st = new HashSet<>();
        for(char c: s.toCharArray()){
          while(st.contains(c)){
            st.remove(s.charAt(l));
            l++;
          }
          st.add(c);
          r++;
          len = Math.max(r-l, len);
        }
        return len;
    }
}
