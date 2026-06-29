// Problem: Flood Fill Algorithm

public class Day31_FloodFill {

    public static int[][] floodFill(
            int[][] image,
            int sr,
            int sc,
            int newColor) {

        int originalColor = image[sr][sc];

        if (originalColor == newColor)
            return image;

        dfs(image, sr, sc, originalColor, newColor);

        return image;
    }

    private static void dfs(
            int[][] image,
            int row,
            int col,
            int originalColor,
            int newColor) {

        if (row < 0 || col < 0 ||
            row >= image.length ||
            col >= image[0].length ||
            image[row][col] != originalColor)
            return;

        image[row][col] = newColor;

        dfs(image, row - 1, col, originalColor, newColor);
        dfs(image, row + 1, col, originalColor, newColor);
        dfs(image, row, col - 1, originalColor, newColor);
        dfs(image, row, col + 1, originalColor, newColor);
    }

    public static void main(String[] args) {

        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        int[][] result = floodFill(image, 1, 1, 2);

        System.out.println("Flood Filled Image:");

        for (int[] row : result) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}