import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 * 
 * √ Your runtime beats 14.65 % of java submissions
 * √ Your memory usage beats 47.16 % of java submissions (42.2 MB)
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (i % 15 == 0)
                lst.add("FizzBuzz");
            else if (i % 3 == 0)
                lst.add("Fizz");
            else if (i % 5 == 0)
                lst.add("Buzz");
            else
                lst.add(String.valueOf(i));
        }
        return lst;
    }
}
