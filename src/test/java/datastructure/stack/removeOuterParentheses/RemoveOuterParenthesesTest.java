package datastructure.stack.removeOuterParentheses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveOuterParenthesesTest {

    RemoveOuterParentheses removeOuterParentheses;

    @Before
    public void init() {
        removeOuterParentheses = new RemoveOuterParentheses();
    }

    @Test
    public void removeOuterParentheses() {
        String s = "(()())(())";
        String expect = "()()()";
        String actual = removeOuterParentheses.removeOuterParentheses(s);
        Assert.assertEquals(expect, actual);
    }
}