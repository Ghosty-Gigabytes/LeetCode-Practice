class Solution {
    public int missingNumber(int[] nums) {
        int currentSum = 0;
        int actualSum = 0;
        int counter = nums.length;
        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            actualSum += counter;
            counter--;
        }
        return actualSum - currentSum;
    }
}