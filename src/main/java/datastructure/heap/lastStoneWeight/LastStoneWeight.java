package datastructure.heap.lastStoneWeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 有一堆石头，每块石头的重量都是正整数。
 * <p>
 * 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * <p>
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/last-stone-weight
 * <p>
 * data: 2019/6/20 15:41
 **/

public class LastStoneWeight {

    /**
     * 1. 遍历数组，每次找出最大的第二大的，然后拷贝出新的数组
     */

    public int lastStoneWeight(int[] stones) {
        while (stones.length > 1) {
            Arrays.sort(stones);

            int heaviest = stones[stones.length - 1];
            int secondHeaviest = stones[stones.length - 2];

            if (heaviest == secondHeaviest) {
                stones = Arrays.copyOf(stones, stones.length - 2);
            } else {
                heaviest = heaviest - secondHeaviest;
                stones[stones.length - 2] = heaviest;
                stones = Arrays.copyOf(stones, stones.length - 1);
            }
        }

        return stones.length == 0 ? 0 : stones[0];
    }


    /**
     * 构建大根堆，每次取出最大的和第二大的，计算差值，如果差值>0，再放入
     */

    public int improvedVersion(int[] stones) {
        // 构建大根堆
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            int diff = Math.abs(x - y);
            if (diff != 0) {
                queue.offer(diff);
            }
        }

        if (queue.isEmpty()) return 0;
        return queue.peek();
    }


}
