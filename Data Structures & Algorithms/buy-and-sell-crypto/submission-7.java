class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i:prices){
            int diff = i-min;
            max = Math.max(max, diff);
            min = Math.min(min,i);
        }
        return max;
    }
}
