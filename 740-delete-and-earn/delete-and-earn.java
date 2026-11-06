class Solution {
    public int solve(int[] points , int i , int[] dp){
        if(i>=points.length)
        return 0;


        if(dp[i] !=-1)
            return dp[i];

            int take = points[i] + solve(points,i+2,dp);
            int skip = solve(points,i+1,dp);

            return dp[i] = Math.max(take,skip);

        
    }
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
           max = Math.max(max , nums[i]);
        }
        int[] points = new int[max+1];
        for(int k=0;k<nums.length;k++){
            points[nums[k]]+=nums[k];
        }
        int[] dp = new int[points.length];
        Arrays.fill(dp ,-1);

        return solve(points ,0,dp);
    }

}