/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 * √ Your runtime beats 92.39 % of java submissions
 * √ Your memory usage beats 67.19 % of java submissions (33.9 MB)
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            int res = guess(mid);
            if (res < 0)
                high = mid - 1;
            else if (res > 0)
                low = mid + 1;
            else
                return mid;
            mid = low + (high - low) / 2;
        }
        return 0;
    }
}
