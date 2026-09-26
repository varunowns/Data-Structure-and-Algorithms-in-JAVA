class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int cnt = 0;
        int row = 0, col = m-1;
        
        while(row<n && col>=0){
            if(grid[row][col] >= 0){
                row++;
            } else {
                cnt = cnt + (n - row);
                col--;
            }
        }
        return cnt;
    }
}