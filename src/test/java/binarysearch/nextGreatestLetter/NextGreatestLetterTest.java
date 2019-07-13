package binarysearch.nextGreatestLetter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreatestLetterTest {

    NextGreatestLetter nextGreatestLetter;

    @Before
    public void init() {
        nextGreatestLetter = new NextGreatestLetter();
    }


    @Test
    public void nextGreatestLetter() {
        char[] chars = {'c', 'f', 'j'};
        char target = 'g';

        System.out.println(nextGreatestLetter.nextGreatestLetter(chars, target));
    }
}