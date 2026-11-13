class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        while(n>0){
            int c = 0;
            int i=n;
            while(i!=0){
                i&=i-1;
                c++;
            }
            res[n] = c;
            n--;
        }
        res[0] = 0;
        return res;
    }
}
