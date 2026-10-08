class Solution {
    public int maxArea(int[] heights) {
        int pointer1 = 0;
        int pointer2 = heights.length - 1;
        int result = 0;

        while(pointer1 < pointer2){
            int area = (pointer2-pointer1)* Math.min(heights[pointer1], heights[pointer2]);
            if (heights[pointer1] <= heights[pointer2]){
                pointer1++;
            }else{
                pointer2--;
            }
            if (area > result){
                result = area;
            }
        }
        return result;
        
    }
}
