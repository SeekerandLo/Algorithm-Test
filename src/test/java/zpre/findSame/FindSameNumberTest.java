package zpre.findSame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSameNumberTest {

    private FindSameNumber findSameNumber;

    @Before
    public void init() {
        findSameNumber = new FindSameNumber();
    }

    @Test
    public void findNumsAppearOnce() {

        int[] arr = {1, 1, 3, 2, 2, 3, 8, 7, 6, 9, 8, 7, 9, 11};
        System.out.println(findSameNumber.findNumsAppearOnce(arr, null, null));

    }

    @Test
    public void test(){
        System.out.println(0^2);
    }
}