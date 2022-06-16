public class _492_constructRectangle {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);
        int L = area/W;
        while(L*W!=area){
            W--;
            L = area/W;
        }
        return new int[]{L, W};
    }
}
