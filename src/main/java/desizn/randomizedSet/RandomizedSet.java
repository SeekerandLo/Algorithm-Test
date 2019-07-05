package desizn.randomizedSet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
 * <p>
 * 1. insert(val)：当元素 val 不存在时，向集合中插入该项。
 * 2. remove(val)：元素 val 存在时，从集合中移除该项。
 * 3. getRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/insert-delete-getrandom-o1
 *
 * @author Liy
 * @date 2019/7/4
 **/

public class RandomizedSet {

    // TODO 有问题

    /**
     * 存放 index 和 val 的关系
     */
    private HashMap<Integer, Integer> indexMap;

    /**
     * 存放元素  val 和 index
     */
    private HashMap<Integer, Integer> valMap;

    private int count;

    public RandomizedSet() {
        indexMap = new HashMap<>();
        valMap = new HashMap<>();
        count = 0;
    }

    public boolean insert(int val) {
        indexMap.put(count, val);
        valMap.put(val, count);

        count++;
        return true;
    }

    public boolean remove(int val) {
        if (valMap.get(val) == null) {
            return false;
        } else {
            int index = valMap.get(val);
            valMap.remove(val);
            indexMap.remove(index);

            count--;

            Integer tail = indexMap.get(count);
            if (tail != null) {
                indexMap.put(index, tail);
                valMap.put(tail, index);
            }
            return true;
        }
    }

    public int getRandom() {
        Random random = new Random();
        int i = random.nextInt(count);
        return indexMap.get(i);
    }

}
