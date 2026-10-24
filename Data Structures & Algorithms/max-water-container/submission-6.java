class Solution {
    public int maxArea(int[] heights) {
        int left =0, right = heights.length-1;
        int result = 0;
        while(left<right){
            int c = (right-left)*(Math.min(heights[left], heights[right]));
            result = Math.max(c,result);
            if(heights[left] < heights[right])
               left++;
            else 
               right--;   
        }
        return result;
    }
}
