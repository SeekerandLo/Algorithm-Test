package swordfingerOffer.string;

/**
 * 替换一串字符串中的空格为 %20
 *
 * @author Liy
 * @date 2019/7/16
 **/

public class ReplaceSpace {

    /**
     * 不考虑 String 的 replace，使用字符串操作
     * <p>
     * 是新创建一个字符串还是在原来的字符串上操作呢？
     * <p>
     * 我选择在原来的字符串上操作
     * <p>
     * 为了防止从前往后遍历会导致移位大量字符，选择从后往前
     *
     * @param str 参数字符串
     * @return 替换后的字符串
     */
    public String replaceSpace(String str) {
        int blankNumber = 0;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                blankNumber++;
            }
        }

        int strLength = stringBuilder.length();
        int newStrLength = strLength + 2 * blankNumber;
        stringBuilder.setLength(newStrLength);

        int strIndex = strLength - 1;
        int newStrIndex = newStrLength - 1;
        while (strIndex >= 0) {
            if (stringBuilder.charAt(strIndex) == ' ') {
                stringBuilder.setCharAt(newStrIndex--, '0');
                stringBuilder.setCharAt(newStrIndex--, '2');
                stringBuilder.setCharAt(newStrIndex--, '%');
                strIndex--;
            } else {
                stringBuilder.setCharAt(newStrIndex--, stringBuilder.charAt(strIndex--));
            }
        }

        return stringBuilder.toString();
    }



}
