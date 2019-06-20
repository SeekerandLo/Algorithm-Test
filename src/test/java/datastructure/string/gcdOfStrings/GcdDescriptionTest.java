package datastructure.string.gcdOfStrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GcdDescriptionTest {

    GcdDescription gcdDescription;

    @Before
    public void init() {
        gcdDescription = new GcdDescription();
    }

    @Test
    public void gcdDescription() {
        System.out.println(gcdDescription.gcdDescription(10, 15));
    }
}