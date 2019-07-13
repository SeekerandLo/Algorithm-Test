package binarysearch.isPerfectSquare;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPerfectSquareTest {

    IsPerfectSquare isPerfectSquare;

    @Before
    public void init() {
        isPerfectSquare = new IsPerfectSquare();
    }

    @Test
    public void isPerfectSquare() {
        int num = 2147483647;

        System.out.println(isPerfectSquare.isPerfectSquare(num));


    }
}