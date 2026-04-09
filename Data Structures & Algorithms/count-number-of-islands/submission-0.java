class Solution {
    //global variables
    int n = 0, m = 0;
    char[][] globalGrid;

    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int islandCount = 0;
        globalGrid = grid;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (globalGrid[i][j] == '1') {
                    islandCount++;
                    //mark all numbers visitable by this island as 0
                    eraseIsland(i, j);
                }
            }
        }

        return islandCount;
    }

    private void eraseIsland(int i, int j) {
        globalGrid[i][j] = '0';

        //check top
        if (i != 0 && globalGrid[i - 1][j] == '1') eraseIsland(i - 1, j);
        //check bottom
        if (i != n - 1 && globalGrid[i + 1][j] == '1') eraseIsland(i + 1, j);
        //check left
        if (j != 0 && globalGrid[i][j - 1] == '1') eraseIsland(i, j - 1);
        //check right
        if (j != m - 1 && globalGrid[i][j + 1] == '1') eraseIsland(i, j + 1);
    }


}
