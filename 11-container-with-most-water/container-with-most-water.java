class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int result = 0;
        int l = 0;
        int r = height.length-1;
        while (l < r){
            area = Math.min(height[l], height[r]) * (r-l);
            if (area > result){
                result = area;
            }
            if (height[l] > height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return result;
    }

}