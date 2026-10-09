class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0;
        int currSum = 0;
        int max = 0;

        for(int r=0;r<nums.length;r++){
            currSum = Math.max(nums[r],currSum+nums[r]);
            max = Math.max(max,currSum);
        }
        currSum =0;
        for(int r=0;r<nums.length;r++){
            currSum = Math.min(nums[r],currSum+nums[r]);
            min = Math.min(min,currSum);

    }
        return Math.max(max,-min);
}
}