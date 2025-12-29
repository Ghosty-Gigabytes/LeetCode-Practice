class Solution {
    public int missingNumber(int[] nums) {
        int currentSum = 0;
        int actualSum = (nums.length*(nums.length +1))/2;
        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
        }
        return actualSum - currentSum;
    }
}