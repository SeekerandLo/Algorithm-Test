package datastructure.stack.removeDuplicates;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates;

    @Before
    public void init() {
        removeDuplicates = new RemoveDuplicates();
    }


    @Test
    public void removeDuplicate() {
        String input = "abbaca";
        String expect = "ca";

        String actual = removeDuplicates.removeDuplicate(input);
        Assert.assertEquals(expect, actual);
    }

}