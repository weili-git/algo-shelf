public class _1893_isCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        return help(0, ranges, left, right);
    }
    private boolean help(int i, int[][] ranges, int left, int right){   // 6种情况
        if(left>right) return true;
        if(i>=ranges.length) return false;
        int[] ra = ranges[i];
        if(ra[0]>right || ra[1]<left) return help(i+1, ranges, left, right);    // case 1, 2: outside of range
        if(ra[0]<=left && ra[1]>=right) return true;    // case 3: fully include
        if(ra[0]>=left && ra[1]<=right) return help(i+1, ranges, left, ra[0]-1) && help(i+1, ranges, ra[1]+1, right);   // case 4: inside of range
        if(ra[0]<=left) return help(i+1, ranges, ra[1]+1, right);   // case 5: intersect
        return help(i+1, ranges, left, ra[0]-1);  // case 6: intersect
    }
}
