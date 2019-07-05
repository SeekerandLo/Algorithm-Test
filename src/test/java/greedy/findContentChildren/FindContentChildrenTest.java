package greedy.findContentChildren;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindContentChildrenTest {

    private FindContentChildren findContentChildren;

    @Before
    public void init() {
        findContentChildren = new FindContentChildren();
    }

    @Test
    public void findContentChildren() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        int expect = 1;
        int actual = findContentChildren.findContentChildren(g, s);
        Assert.assertEquals(expect, actual);
    }
}