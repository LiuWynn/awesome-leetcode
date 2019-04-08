public class CodeTest {
    public static void main(String[] args) {
        String[] strs = {"a"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }

    // ["flower","flow","flight"]
    public static String longestCommonPrefix(String[] strs) {
        int strsLen = strs.length;  // 字符串数组的长度
        if (strs == null || strsLen == 0)
            return "";
        // 1. 计算出字符串数组中最短字符串的index
        // 2. 设最短字符串长度为min，循环min次
        // 3. 不断取出第一个字符串的字符与其他的字符串相应位置的字符进行比较
        //  3.1 若都相等，则进行下一次比较
        //  3.2 若不相等，则返回公共前缀
        int minIndex = getShortestStrIndex(strs);
        System.out.println("minIndex:"+minIndex);
        int minStrLen = strs[minIndex].length();  // 最短字符串的长度
        System.out.println("minStrIndex:"+minStrLen);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < minStrLen; i++) {  // 大循环下，取出每个 str 在 i 下标的字符
            char ch = strs[0].charAt(i); // 第一个字符串的第 i 个字符
            for (int j = 1; j < strsLen; j++) {  // 小循环，将每个 str 对应位置下的字符进行比较
                if (ch != strs[j].charAt(i))   // 不相等
                    return sb.toString();
            }
            // 相等
            sb.append(ch);
        }
        return sb.toString();
    }

    public static int getShortestStrIndex(String[] strs) {
        int length = strs.length;
        if (length == 1)
            return 0;
        int minIndex = 0;
        int minLen = strs[0].length();
        for (int i = 1; i < length; i++) {
            if (strs[i].length() < minLen) {
                minIndex = i;
                minLen = strs[i].length();
            }
        }    
        return minIndex;
    }
}