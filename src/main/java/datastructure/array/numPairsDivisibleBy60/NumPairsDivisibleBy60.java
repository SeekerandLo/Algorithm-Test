package datastructure.array.numPairsDivisibleBy60;

import java.util.HashMap;

/**
 * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
 * <p>
 * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望索引的数字  i < j 且有 (time[i] + time[j]) % 60 == 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class NumPairsDivisibleBy60 {
    /**
     * 首先能想到的是 暴力求解
     */
    public int violence(int[] time) {
        int ans = 0;
        for (int i = 0; i < time.length; i++) {
            int j = i + 1;
            while (j < time.length) {
                if ((time[i] + time[j]) % 60 == 0) {
                    ans++;
                }
                j++;
            }
        }
        return ans;
    }

    /**
     * 使用 hashMap，如果一首歌的时间对60取余数 是20，那么与他配对的歌曲对60取余数应该是40
     */
    public int mapIdea(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int value : time) {
            int remainder = value % 60;
            if (map.containsKey((60 - remainder) % 60)) {
                ans += map.get((60 - remainder) % 60);
            }
            map.put(remainder, (map.containsKey(remainder) ? map.get(remainder) + 1 : 1));
        }

        return ans;
    }

}
