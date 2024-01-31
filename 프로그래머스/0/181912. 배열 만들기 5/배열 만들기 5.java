import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
            .mapToInt(item -> Integer.parseInt(item.substring(s, s+l)))
            .filter(item -> k < item)
            .toArray();
    }
}