class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0;
        Set<Character> ch = new HashSet<>();
        int length =0;
        for(char c:s.toCharArray()){
          while(ch.contains(c)){
             ch.remove(s.charAt(left));
             left++;
          }
          ch.add(c);
          right++;
          length = Math.max(length, right-left);
        }
        return length;
    }
}
