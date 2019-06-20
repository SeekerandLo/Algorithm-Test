package datastructure.string.gcdOfStrings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GcdOfStringsTest {

    GcdOfStrings gcdOfStrings;

    @Before
    public void init() {
        gcdOfStrings = new GcdOfStrings();
    }

    @Test
    public void string_div_test() {
        String str1 = "ABCABC";
        String str2 = "ABC";

        String expect = "ABC";
        String actual = gcdOfStrings.gcdOfStrings(str1, str2);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void string_div_test2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        String expect = "AB";
        String actual = gcdOfStrings.gcdOfStrings(str1, str2);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void string_div_test3() {
        String str1 = "LEET";
        String str2 = "CODE";

        String expect = "";
        String actual = gcdOfStrings.gcdOfStrings(str1, str2);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void gcdOfStrings_test() {


    }
}