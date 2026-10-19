class Solution {
    public int solve(int[][] grid , int i , int j , int[][] dp){
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n){
            return Integer.MAX_VALUE;
        }

        if(i == m-1 && j == n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        int right = solve(grid,i,j+1,dp);
        int down = solve(grid,i+1,j,dp);

        dp[i][j] = grid[i][j]+ Math.min(right ,down);

        return dp[i][j];

    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        return solve(grid,0,0,dp);
    }
}