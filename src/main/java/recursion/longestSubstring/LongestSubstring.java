package recursion.longestSubstring;

/**
 * 找到给定字符串（由小写字符组成）中的最长子串 T ， 要求 T 中的每一字符出现次数都不少于 k 。输出 T 的长度。
 * https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters/
 *
 * @author Liy
 * @date 2019/7/4
 **/

public class LongestSubstring {

    /**
     * 看题解有感
     * 字母数组计数法  times[s.charAt[i] - 'a'] ++
     * <p>
     * 如果有字符的次数小于 k，那么结果字串中一定不包含它，所以要以该字符为界进行分割原字符串
     */
    public int longestSubstring(String s, int k) {
        int len = s.length();
        if (len == 0 || k > len) {
            return 0;
        }
        if (k < 2) {
            return len;
        }

        return helper(s.toCharArray(), k, 0, len - 1);
    }

    private int helper(char[] chars, int k, int left, int right) {
        if (right - left + 1 < k) {
            return 0;
        }
        int[] times = new int[26];
        // 计数，计算这段字串中字符的个数
        for (int i = left; i <= right; ++i) {
            ++times[chars[i] - 'a'];
        }

        // 当该字符串出现的次数小于 k 时，不应该出现在答案中
        while (right - left + 1 >= k && times[chars[left] - 'a'] < k) {
            left++;
        }

        while (right - left + 1 >= k && times[chars[right] - 'a'] < k) {
            right--;
        }

        if (right - left + 1 < k) {
            return 0;
        }

        for (int i = left; i < right; i++) {
            if (times[chars[i] - 'a'] < k) {
                return Math.max(helper(chars, k, left, i - 1), helper(chars, k, i + 1, right));
            }
        }

        // 这个字串的长度
        return right - left + 1;
    }

    private static int count(char[] chars, int k, int p1, int p2) {
        if (p2 - p1 + 1 < k) {
            return 0;
        }
        //  26个字母
        int[] times = new int[26];
        //  统计出现频次
        for (int i = p1; i <= p2; ++i) {
            ++times[chars[i] - 'a'];
        }
        //  如果该字符出现频次小于k，则不可能出现在结果子串中
        //  分别排除，然后挪动两个指针
        while (p2 - p1 + 1 >= k && times[chars[p1] - 'a'] < k) {
            ++p1;
        }
        while (p2 - p1 + 1 >= k && times[chars[p2] - 'a'] < k) {
            --p2;
        }

        if (p2 - p1 + 1 < k) return 0;
        //  得到临时子串，再递归处理
        for (int i = p1; i <= p2; ++i) {
            //  如果第i个不符合要求，切分成左右两段分别递归求得
            if (times[chars[i] - 'a'] < k) {
                return Math.max(count(chars, k, p1, i - 1), count(chars, k, i + 1, p2));
            }
        }
        return p2 - p1 + 1;
    }
}
