package recursion.longestSubstring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    LongestSubstring longestSubstring;

    @Before
    public void init() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    public void longestSubstring() {
        String s = "aaabb";
        int k = 3;

        int expect = 3;

        int actual = longestSubstring.longestSubstring(s, k);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void longestSubstring_test2() {
        String s = "ababacb";
        int k = 3;

        int expect = 0;

        int actual = longestSubstring.longestSubstring(s, k);
        Assert.assertEquals(expect, actual);
    }
}