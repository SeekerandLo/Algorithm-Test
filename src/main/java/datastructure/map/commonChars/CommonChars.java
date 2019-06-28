package datastructure.map.commonChars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class CommonChars {
    HashMap<Character, Integer> map = new HashMap<>();


    /**
     * 因为要各个字符串中都存在的，所以遍历一个即可
     */
    public List<String> commonChars(String[] array) {
        String s = array[0];
        List<String> stringList = new ArrayList<>();
        return stringList;
    }
}
