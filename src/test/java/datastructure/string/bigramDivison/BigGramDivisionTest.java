package datastructure.string.bigramDivison;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigGramDivisionTest {

    BigGramDivision bigGramDivision;

    @Before
    public void init() {
        bigGramDivision = new BigGramDivision();
    }

    @Test
    public void findThirdResult_test1() {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";

        String[] expect = {"girl", "student"};

        String[] actual = bigGramDivision.findThirdResult(text, first, second);

        Assert.assertArrayEquals(expect,actual);
    }

    @Test
    public void findThirdResult_test2() {
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";

        String[] expect = {"we","rock"};

        String[] actual = bigGramDivision.findThirdResult(text, first, second);

        Assert.assertArrayEquals(expect,actual);
    }
}