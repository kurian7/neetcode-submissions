class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            for(String s : strs){
            if(i == s.length() || strs[0].charAt(i) != s.charAt(i)){
                return new String(result);
            }
            }
            result.append(strs[0].charAt(i));
        }
        return new String(result);
    }
}