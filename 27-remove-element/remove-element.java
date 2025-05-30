class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        if (nums.length != 0) {
            int i = 0;
            int j = 0;
            while (i < nums.length) {
                if (nums[i] != val) {
                    nums[j] = nums[i];
                    j++;
                }
                if (nums[i] == val){
                    count++;
                }
                i++;
            }
            count = nums.length - count;
        }
        return count;
    }
}