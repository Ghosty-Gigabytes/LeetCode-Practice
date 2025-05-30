class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        if (nums.length != 0) {
            for(int a: nums) {
                if (a != val) {
                    nums[j] = a;
                    j++;
                }
            }
            
        }
        return j;
    }
}