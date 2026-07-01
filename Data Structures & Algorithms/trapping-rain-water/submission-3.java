class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] l = new int[n];
        int[] r =new int[n];
        int maxL= height[0];
        int maxR= height[n-1];
        for(int i=0; i<n; i++){
            maxL= Math.max(maxL, height[i]);
            l[i]= maxL;
        }
        for(int i=n-1; i>=0; i--){
            maxR= Math.max(maxR, height[i]);
            r[i]= maxR;
        }
        int total =0;
        for(int i=0; i<n; i++){
            total+= Math.min(l[i],r[i]) - height[i];
           
        }
        return total;
    }
}
