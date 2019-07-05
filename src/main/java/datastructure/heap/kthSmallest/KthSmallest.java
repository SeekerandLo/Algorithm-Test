package datastructure.heap.kthSmallest;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Liy
 * @date 2019/7/5
 **/

public class KthSmallest {

    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;
        int ans = 0;

        Queue<Integer> heap = new PriorityQueue<>();

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                heap.offer(ints[j]);
            }
        }

        for (int i = 1; i <= k; i++) {
            if (i == k) {
                ans = heap.peek();
            }
            heap.poll();
        }

        return ans;
    }

}
