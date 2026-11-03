class Solution {
    public int solve(int[] nums , int target , int sum ,int i ,  int[][] dp){
        if(i == nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        if(sum>target){
            return 0;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }
        int pos = solve(nums,target , sum+nums[i] , i+1,dp);
        int neg = solve(nums,target , sum , i+1,dp);

        return dp[i][sum] = pos+neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for(int k = 0;k<nums.length;k++){
            totalSum+=nums[k];
        }
        if(Math.abs(target)>totalSum){
            return 0;
        }
        if((totalSum - target) % 2 != 0) {
            return 0;
        }
        int newTarget = (totalSum-target)/2;
        int dp[][] = new int[nums.length][newTarget+1];
        for (int i = 0; i < nums.length; i++) {
         for (int j = 0; j <= newTarget; j++) {
        dp[i][j] = -1;
    }
}
        return solve(nums,newTarget ,0,0, dp);
    }
}