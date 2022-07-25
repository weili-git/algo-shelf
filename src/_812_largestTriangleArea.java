import java.util.Arrays;

public class _812_largestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        int n = points.length;
        double x1, y1, x2, y2;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    x1 = points[i][0]-points[j][0];
                    y1 = points[i][1]-points[j][1];

                    x2 = points[j][0]-points[k][0];
                    y2 = points[j][1]-points[k][1];
                    max = Math.max(max,Math.abs(x1*y2-x2*y1));
                }
            }
        }
        return max/2;
    }
}
