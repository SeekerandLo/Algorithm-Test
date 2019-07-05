package datastructure.map.commonChars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CommonCharsTest {

    CommonChars commonChars;

    @Before
    public void init() {
        commonChars = new CommonChars();

    }

    @Test
    public void commonChars() {
        String[] array = {"bella", "label", "roller"};

        System.out.println(commonChars.commonChars(array));
    }

    @Test
    public void test_char() {
        char a = 'a';

        System.out.println(a - 97);


    }
}