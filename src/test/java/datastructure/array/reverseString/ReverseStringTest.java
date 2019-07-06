package datastructure.array.reverseString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void init() {
        reverseString = new ReverseString();
    }

    @Test
    public void reverseString() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        char[] expect = {'o', 'l', 'l', 'e', 'h'};

        char[] actual = reverseString.reverseString(chars);

        System.out.println(actual);
    }
}