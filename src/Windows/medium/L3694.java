package Windows.medium;

import java.util.HashSet;
import java.util.Set;

//删除子字符串后不同的终点
public class L3694 {
    public int distinctPoints(String s, int k) {
        Set<Long> flag = new HashSet<>();
        int i = 0;
        int row = 0;
        int colum = 0;
        int result = 0;
        for (i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == 'U') colum++;
            if (temp == 'D') colum--;
            if (temp == 'L') row--;
            if (temp == 'R') row++;
            int left = i - k + 1;
            if (left < 0) continue;
            if (flag.add((long) row * 200001 + colum)) result++;
            temp = s.charAt(left);
            if (temp == 'U') colum--;
            if (temp == 'D') colum++;
            if (temp == 'L') row++;
            if (temp == 'R') row--;
        }
        return result;
    }
}
