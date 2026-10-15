class Solution {
    public boolean solve(int[] arr , int start, boolean[] jump , boolean[] dp){
        if(start<0 || start >=arr.length ||  jump[start])
        return false;

        if(dp[start])
        return dp[start];
        if(arr[start] ==0)
        return dp[start] =true;

        jump[start] = true;
       boolean a= solve(arr,start-arr[start],jump,dp);
      boolean b=  solve(arr, start+arr[start] , jump,dp);

    return dp[start] = a || b;
}

    public boolean canReach(int[] arr, int start) {
        boolean[] jump = new boolean[arr.length];
        boolean[] dp = new boolean[arr.length];
        return solve(arr,start , jump,dp);
    }
    }
