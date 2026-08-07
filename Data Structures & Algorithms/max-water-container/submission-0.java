class Solution {
    public int maxArea(int[] heights) {
        int maxwater=0;
        int n=heights.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int width=j-i;
            int height=Math.min(heights[i],heights[j]);
            maxwater=Math.max(maxwater,height*width);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxwater;

        
    }
}
