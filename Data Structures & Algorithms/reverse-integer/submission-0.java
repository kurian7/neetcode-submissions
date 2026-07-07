class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int res =0;
        while(x != 0){
            if(res> max/10 || res < min/10){
                return 0;
            }
            int cur = x%10;
            if((res == max/10 && cur>max%10) || (res== min/10 && cur<min%10))
               return 0;
            res = res *10+cur;
            x=x/10;
        }
        return res;

    }
}
