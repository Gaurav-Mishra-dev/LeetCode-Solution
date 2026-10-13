class Solution {
    public boolean solve(int[] stones , int lastIdx , int currIdx , int k , Boolean[][] dp){
        int n = stones.length;
        if(currIdx == n-1)
        return true;

        if(dp[currIdx][k] != null)
        return dp[currIdx][k];

        for(int i = k-1;i<=k+1;i++){
            if(i<=0) continue;
            int next = stones[currIdx]+i;

            int left = currIdx+1;
            int right = n-1;

            while(left<=right){
                int mid = left+(right-left)/2;
                if(stones[mid] == next){
                    if(solve(stones ,currIdx,mid,i,dp))
                    return dp[currIdx][k]=true;

                    break;
                }else if(stones[mid]<next){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return dp[currIdx][k]=false;
    }
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if(n<2 || stones[1]!=1){
            return false;
        }
        Boolean[][] dp = new Boolean[n][n];

        return solve(stones , 0,1,1,dp);
    }
}