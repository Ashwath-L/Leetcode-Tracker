// Last updated: 7/9/2026, 3:10:26 PM
class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        for(int i = 0;i<=n;i++){
            dp[i]=-1;
        }
        return helper(n,dp);
    }
    int helper(int n,int dp[]){
        if(n<=2){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
}

