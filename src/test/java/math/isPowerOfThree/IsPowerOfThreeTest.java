package math.isPowerOfThree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPowerOfThreeTest {

    IsPowerOfThree isPowerOfThree;

    @Before
    public void init() {
        isPowerOfThree = new IsPowerOfThree();
    }

    @Test
    public void isPowerOfThreeThreeSystem() {
        System.out.println(isPowerOfThree.isPowerOfThreeThreeSystem(1));
    }


    @Test
    public void test_math_integer_three() {
        String threeSystem = Integer.toString(1, 3);
//        String threeSystem = Integer.toString(9, 3);

//        String threeSystem = Integer.toString(9, 3);
        System.out.println(threeSystem);
    }
}