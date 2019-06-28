package datastructure.array.prefixesDivBy5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrefixesDivBy5Test {

    PrefixesDivBy5 prefixesDivBy5;

    @Before
    public void init() {
        prefixesDivBy5 = new PrefixesDivBy5();
    }

    @Test
    public void prefixesDivBy5() {
        int[] array = {0, 1, 1};

        Boolean[] expectArray = {true, false, false};

        List<Boolean> booleanList = new ArrayList<>(Arrays.asList(expectArray));

        List<Boolean> actualList = prefixesDivBy5.prefixesDivBy5(array);

        Assert.assertEquals(booleanList, actualList);
    }

    @Test
    public void prefixesDivBy5_test2() {
        int[] array = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};

        Boolean[] expectArray = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,true,true,true,true,false};

        List<Boolean> booleanList = new ArrayList<>(Arrays.asList(expectArray));

        List<Boolean> actualList = prefixesDivBy5.prefixesDivBy5(array);

        Assert.assertEquals(booleanList, actualList);
    }
}