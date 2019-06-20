package datastructure.hash.findGemstone;

import java.util.*;

/**
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jewels-and-stones
 *
 * data: 2019/6/20 10:05
 **/

public class FindGemstone {

    // Violent Solution
    public int findGemstone(String J, String S) {
        int resultCount = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> jMap = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            sMap.merge(c, 1, Integer::sum);
        }

        for (int j = 0; j < J.length(); j++) {
            Character c = J.charAt(j);
            jMap.merge(c, 1, Integer::sum);
        }

        Set jTypeSet = jMap.keySet();
        Set sTypeSet = sMap.keySet();

        jTypeSet.retainAll(sTypeSet);

        for (Object c : jTypeSet) {
            resultCount += sMap.get(c);
        }

        return resultCount;
    }

    // Improvement O(m+n)
    public int improvement(String J, String S) {
        int resultCount = 0;
        Set<Character> jSet = new HashSet<>();

        for (int i = 0; i < J.length(); i++) {
            jSet.add(J.charAt(i));
        }

        for (int j = 0; j < S.length(); j++) {
            if (jSet.contains(S.charAt(j))) {
                resultCount++;
            }
        }

        return resultCount;
    }
}
