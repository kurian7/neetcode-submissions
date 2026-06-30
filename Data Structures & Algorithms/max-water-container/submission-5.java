class Solution {
    public int maxArea(int[] heights) {
        int left =0, right = heights.length -1;
        int result = 0;
        while(left<right){
            int c = (right-left)*Math.min(heights[left],heights[right]);
            if(heights[left] < heights[right])
               left++;
            else
                right--;
            result = Math.max(result, c) ;      
        }
        return result;
    }
}
