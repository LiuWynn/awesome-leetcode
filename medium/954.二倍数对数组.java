import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=954 lang=java
 *
 * [954] 二倍数对数组
 * 
 * Your runtime beats 46.46 % of java submissions
 * Your memory usage beats 96.67 % of java submissions (43.3 MB)
 */

// @lc code=start
class Solution {
    public boolean canReorderDoubled(int[] A) {
        Map<Integer, Integer> map = new HashMap<>(A.length);
        for (int val : A) {
            if (map.containsKey(val)) {
                // 如果包含val
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
        Arrays.sort(A);
        // 正式检验A中元素有没有倍数
        for (int val : A) {
            // 不重复比较
            if (map.get(val) == 0) {
                continue;
            } else if (map.containsKey(val * 2) && map.get(val) > 0 && map.get(val * 2) > 0) {
                int valCnt = map.get(val);
                int doubledValCnt = map.get(val * 2);
                // 如果存在二倍于当前元素的值
                map.put(val, valCnt - 1);
                map.put(val * 2, doubledValCnt - 1);
            } else if ((val % 2) == 0 && map.containsKey(val / 2) && map.get(val) > 0 && map.get(val / 2) > 0) {
                int valCnt = map.get(val);
                int halfValCnt = map.get(val / 2);
                // 如果val是偶数的话，看看有没有val/2的值
                map.put(val, valCnt - 1);
                map.put(val / 2, halfValCnt - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
