package datastructure.hash.findGemstone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindGemstoneTest {

    FindGemstone findGemstone;


    @Before
    public void init() {
        findGemstone = new FindGemstone();
    }

    @Test
    public void findGemstone_test1() {
        String J = "z";
        String S = "ZZOOPPz";

        Integer expect = 1;
        Integer actual = findGemstone.findGemstone(J, S);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void findGemstone_test2() {
        String J = "aA";
        String S = "aAAbbbb";

        Integer expect = 3;
        Integer actual = findGemstone.findGemstone(J, S);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void improvement_test1(){
        String J = "z";
        String S = "ZZOOPPz";

        Integer expect = 1;
        Integer actual = findGemstone.improvement(J, S);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void improvement_test2() {
        String J = "aA";
        String S = "aAAbbbb";

        Integer expect = 3;
        Integer actual = findGemstone.improvement(J, S);

        Assert.assertEquals(expect, actual);
    }

}