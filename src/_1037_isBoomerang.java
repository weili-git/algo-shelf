public class _1037_isBoomerang {
    public boolean isBoomerang(int[][] points) {
        if(Same(points[0], points[1])||Same(points[1], points[2])) return false; // distinct
        if(points[0][0]==points[1][0]&&points[1][0]==points[2][0]) return false; // vertical
        return ! (slope(points[0], points[1]) == slope(points[1],points[2]));
    }
    private boolean Same(int[] a, int[] b){
        return a[0]==b[0]&&a[1]==b[1];
    }
    private double slope(int[] a, int[] b){
        return ( (double)a[1]-(double)b[1] ) / ( (double) a[0] - (double) b[0]);
    }
}

