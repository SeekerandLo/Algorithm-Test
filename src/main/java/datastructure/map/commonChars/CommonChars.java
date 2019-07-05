package datastructure.map.commonChars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class CommonChars {

    /**
     * 定义一个 26 个字母的数组，分别计算该字母出现的次数
     * <p>
     * 遍历整个 字符串数组，第一个字符串会对上述字母数组中的内容进行刷新，之后的字符串是对上述字母数组的数组的修改。
     */
    public List<String> commonChars(String[] array) {
        int[] res = new int[26];
        boolean flag = true;
        for (String s : array) {
            char[] strArray = s.toCharArray();
            if (flag) {
                for (char c : strArray) {
                    res[c - 97]++;
                }
                flag = false;
            } else {
                int[] temp = new int[26];

                for (char c : strArray) {
                    temp[c - 97]++;
                }

                for (int n = 0; n < res.length; n++) {
                    if (res[n] > temp[n]) {
                        res[n] = temp[n];
                    }
                }
            }
        }

        List<String> ans = new ArrayList<>();
        for(int i = 0; i < res.length; ++i) {
            if(res[i] != 0) {
                String tmp = String.valueOf((char)(i + 97));
                for(int j = 0; j < res[i]; ++j) {
                    ans.add(tmp);
                }
            }
        }
        return ans;
    }

    /**
     * hash 表法
     */
    public List<String> commonCharsHash(String[] array) {
//        // 维护 字母 与 次数的关系
//        HashMap<Character, Integer> charMap = new HashMap<>();
//        boolean flag = true;
//        for (int i = 0; i < array.length; i++) {
//            char[] chars = array[i].toCharArray();
//            if (flag) {
//                for (int j = 0; j < chars.length; j++) {
//                    char currChar = chars[i];
//                    if (charMap.containsKey(currChar)) {
//                        int count = charMap.get(currChar);
//                        charMap.put(currChar, count++);
//                    } else {
//                        charMap.put(currChar, 1);
//                    }
//                }
//                flag = false;
//            } else {
//                HashMap<Character, Integer> tempCharMap = new HashMap<>();
//                for ()
//            }
//        }

        return null;
    }
}
