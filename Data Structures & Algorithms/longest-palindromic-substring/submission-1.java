class Solution {
    public String longestPalindrome(String s) {
        int resL = 0, rIdx =0;
        for(int i=0; i<s.length(); i++){
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > resL){
                    resL = r-l+1;
                    rIdx =l;

                }
                r++;
                l--;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > resL){
                    resL = r-l+1;
                    rIdx =l;

                }
                r++;
                l--;
            }
        }
        return s.substring(rIdx,rIdx+resL);
    }
}
