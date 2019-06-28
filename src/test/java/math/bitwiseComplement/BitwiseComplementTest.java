package math.bitwiseComplement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitwiseComplementTest {

    BitwiseComplement bitwiseComplement;


    @Before
    public void init() {
        bitwiseComplement = new BitwiseComplement();
    }

    @Test
    public void bitwiseComplement() {
        int a = 5;
        int expect = 2;
        int actual = bitwiseComplement.bitwiseComplement(a);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void byteMath() {
        int a = 5;
        int n = a & 0x1;
        System.out.println(n);
    }
}