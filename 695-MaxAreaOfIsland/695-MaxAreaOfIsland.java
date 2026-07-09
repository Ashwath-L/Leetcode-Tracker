// Last updated: 7/9/2026, 3:08:05 PM
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int max=0;
        for(int i=0;i<m;i++){
            int ans=0;
            int c=1;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    ans=bfs(i,j,m,n,vis,grid, c);
                    max=Math.max(max, ans);
                }
            }
       
        }
        return max;
    }
    int bfs(int i, int j, int m, int n, boolean[][] vis, int[][] grid, int c){
        Queue<int []> q=new LinkedList<>();
        q.add(new int[]{i, j});
        vis[i][j]=true;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0){
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int k=0;k<4;k++){
                int nr=x+dir[k][0];
                int nc=y+dir[k][1];
                if(nr<m && nr>=0 && nc<n && nc>=0 && grid[nr][nc]==1 && vis[nr][nc]==false) {
                    q.add(new int[]{ nr,nc});
                    c++;
                    vis[nr][nc]=true;
                }
            }
        }
        return c;
    }
}