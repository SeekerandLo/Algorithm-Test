package datastructure.heap.topKFrequent;

import java.util.*;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * @author Liy
 * @date 2019/7/5
 **/

public class TopKFrequent {

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();

        Queue<Map.Entry> pq = new PriorityQueue<>((o1, o2) -> {
            return ((Integer) o2.getValue()).compareTo((Integer) o1.getValue());
        });

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        /**
         * 如此调整堆
         * for (Integer key : map.keySet()) {
         *      if (pq.size() < k) {
         *          pq.add(key);
         *      } else if (map.get(key) > map.get(pq.peek())) {
         *          pq.remove();
         *          pq.add(key);
         *      }
         *  }
         *
         */
        for (Map.Entry entry : countMap.entrySet()) {
            pq.offer(entry);
        }

        for (int i = 0; i < k; i++) {
            ans.add((Integer) pq.poll().getKey());
        }

        return ans;
    }

}
