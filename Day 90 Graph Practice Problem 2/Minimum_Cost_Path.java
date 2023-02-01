class Solution

{

    public int fun(int row, int col, int [][] grid, int [][] visited ){

        int N = grid.length; 

        int M = grid[0].length;

       

        if(row == 0 && col == 0) return grid[0][0];

        

        if(row < 0 || row >= N || col < 0 || col >= M 

        || visited[row][col] == 1) return (int)1e9;

        

        visited[row][col] = 1;

        

        int top = grid[row][col] + fun(row-1, col, grid, visited);

        int right = grid[row][col] + fun(row, col+1, grid, visited);

        int bottom = grid[row][col] + fun(row+1, col, grid, visited);

        int left = grid[row][col] + fun(row, col-1, grid, visited);

        

        visited[row][col] = 0;

        return Math.min( Math.min(top,bottom), Math.min(left, right));

    }

    //Function to return the minimum cost to react at bottom

 //right cell from top left cell.

    public int minimumCostPath(int[][] grid)

    {

        int N = grid.length;

        int M = grid[0].length;

        int [][] visited = new int[N][M];

        

        return fun(N-1, M-1, grid, visited);

    }

}