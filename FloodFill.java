class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];

        fillColor(image, visited, image[sr][sc], color, sr, sc);
        return image;       
    }

    public void fillColor(int [][] image, boolean [][] visited, int prev, int color, int sr, int sc){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || visited[sr][sc] == true || image[sr][sc] != prev ){
            return;
        }

        visited[sr][sc] = true;
        fillColor(image, visited, image[sr][sc], color, sr - 1, sc);
        fillColor(image, visited, image[sr][sc], color, sr, sc + 1);
        fillColor(image, visited, image[sr][sc], color, sr + 1, sc);
        fillColor(image, visited, image[sr][sc], color, sr, sc - 1);
        image[sr][sc] = color;

    }
}
