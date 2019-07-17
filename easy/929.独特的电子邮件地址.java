import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=929 lang=java
 *
 * [929] 独特的电子邮件地址
 * 
 * √ Your runtime beats 27.86 % of java submissions
 * √ Your memory usage beats 5 % of java submissions (55.6 MB)
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        if (emails == null)
            return 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            // 1、先截取到@的字符串
            int atIndex = email.indexOf("@");
            String prefix = email.substring(0, atIndex);
            String suffix = email.substring(atIndex);
            // 2、去掉到@的字符串中"."
            prefix = prefix.replace(".", "");
            // 3、去掉+到@之间的字符串
            int plusIndex = prefix.indexOf("+");
            if (plusIndex > 0)
                prefix = prefix.substring(0, plusIndex);
            // 4、将@前字符串和@后字符串进行拼接
            // emails[i] = prefix + suffix;
            set.add(prefix + suffix);
        }
        return set.size();
    }
}
