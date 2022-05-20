public class _733_floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor==image[sr][sc]) return image;
        int color = image[sr][sc];
        image[sr][sc] = newColor;
        if(sr>=1 && image[sr-1][sc]==color){
            floodFill(image, sr-1, sc, newColor);
        }
        if(sc>=1 && image[sr][sc-1]==color){
            floodFill(image, sr, sc-1, newColor);
        }
        if(sr<image.length-1 && image[sr+1][sc]==color){
            floodFill(image, sr+1, sc, newColor);
        }
        if(sc<image[0].length-1 && image[sr][sc+1]==color){
            floodFill(image, sr, sc+1, newColor);
        }
        return image;
    }
}
