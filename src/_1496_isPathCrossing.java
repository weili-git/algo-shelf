import java.util.HashSet;
import java.util.Set;

public class _1496_isPathCrossing {
    public boolean isPathCrossing(String path) {
        // 低位存x，高位存y
        int x = 0, y = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (char c : path.toCharArray()) {
            if (c == 'N')
                y++;
            if (c == 'S')
                y--;
            if (c == 'E')
                x += 20001;
            if (c == 'W')
                x -= 20001;
            if (!set.add(x + y))
                return true;
        }
        return false;
    }
}
