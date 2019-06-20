package datastructure.string.bigramDivison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
 * <p>
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/occurrences-after-bigram
 * <p>
 * data: 2019/6/20 10:46
 **/

public class BigGramDivision {

    // Violent Solution
    public String[] findThirdResult(String text, String first, String second) {
        List<String> resultAList = new ArrayList<>();

        String[] textArray = text.split(" ");
        for (int i = 1, j = 0; i < textArray.length - 1; i++, j++) {
            if (textArray[i].equals(second) && textArray[j].equals(first)) {
                resultAList.add(textArray[i + 1]);
            }
        }

        System.out.println(resultAList);
        return resultAList.toArray(new String[0]);
    }

}
