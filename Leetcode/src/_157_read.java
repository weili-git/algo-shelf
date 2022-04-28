public class _157_read {
    public static int read4(char[] a){
        return 1;
    }
    public static int read(char[] buf, int n){
        char[] buffer = new char[4];
        int readBytes = 0;
        boolean eof = false;

        while (!eof && readBytes<n){
            int sz = read4(buffer);
            if(sz<4) eof = true;

            int bytes = Math.min(n-readBytes, sz);
            // System.arraycopy(buffer, buf, readBytes, bytes);
            readBytes += bytes;
        }
        return readBytes;
    }
}
