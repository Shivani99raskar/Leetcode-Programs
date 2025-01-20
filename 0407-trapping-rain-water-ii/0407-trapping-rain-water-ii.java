// 

import java.util.PriorityQueue;

class Solution {
    private static class Cell {
        int row, col, height;
        Cell(int r, int c, int h) {
            this.row = r;
            this.col = c;
            this.height = h;
        }
    }

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) return 0;

        int m = heightMap.length, n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> minHeap = new PriorityQueue<>((a, b) -> a.height - b.height);

        // Add all boundary cells to the min-heap
        for (int i = 0; i < m; i++) {
            minHeap.offer(new Cell(i, 0, heightMap[i][0]));
            minHeap.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = visited[i][n - 1] = true;
        }
        for (int j = 1; j < n - 1; j++) {
            minHeap.offer(new Cell(0, j, heightMap[0][j]));
            minHeap.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = visited[m - 1][j] = true;
        }

        int totalWater = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Process cells in the min-heap
        while (!minHeap.isEmpty()) {
            Cell cell = minHeap.poll();
            for (int[] dir : directions) {
                int newRow = cell.row + dir[0];
                int newCol = cell.col + dir[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    int neighborHeight = heightMap[newRow][newCol];
                    if (neighborHeight < cell.height) {
                        totalWater += cell.height - neighborHeight;
                    }
                    minHeap.offer(new Cell(newRow, newCol, Math.max(cell.height, neighborHeight)));
                }
            }
        }

        return totalWater;
    }
}