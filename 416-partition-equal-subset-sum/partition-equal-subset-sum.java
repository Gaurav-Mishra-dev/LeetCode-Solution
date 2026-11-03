class Solution {
    public boolean solve(int[] nums , int sum , int target , int i,Boolean dp[][]){
        if(sum == target){
            return true;
        }
        if(sum>target || i == nums.length){
            return false;
        }
        if(dp[i][sum] != null){
            return dp[i][sum];
        }
        boolean take = solve(nums , sum+nums[i] ,target, i+1,dp);
        boolean skip = solve(nums , sum , target , i+1,dp);
        
        return dp[i][sum] =  take || skip;
    }
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int k=0;k<nums.length;k++){
            totalSum+=nums[k];
        }
        if(totalSum % 2 !=0){
            return false;
        }
        int target = totalSum/2;
        Boolean dp[][] = new Boolean[nums.length][target+1];

        return solve(nums,0,target,0,dp);
    }
}