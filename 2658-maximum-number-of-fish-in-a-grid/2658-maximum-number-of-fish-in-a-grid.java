class Solution {
    public int findMaxFish(int[][] grid) {
       int n = grid.length;
    int m = grid[0].length;
    int ans = 0; 
    int[] dr = {0, 1, 0, -1}; 
    int[] dc = {1, 0, -1, 0};
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            if(grid[i][j] > 0) { 
                Queue<int[]> q = new LinkedList<>(); 
                q.offer(new int[]{i, j}); 
                int f = grid[i][j]; 
                grid[i][j] = 0; 
                while(!q.isEmpty()) { 
                    int[] curr = q.poll(); 
                    for(int k = 0; k < 4; k++) { 
                        int nr = curr[0] + dr[k]; 
                        int nc = curr[1] + dc[k];
                        if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] > 0) { 
                            f += grid[nr][nc];
                            grid[nr][nc] = 0; 
                            q.offer(new int[]{nr, nc}); 
                        }
                    }
                }
                ans = Math.max(ans, f); 
            }
        }
    }
return ans;  
    }
}