package datastructure.array.moveZeroes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    MoveZeroes moveZeroes;

    @Before
    public void init() {
        moveZeroes = new MoveZeroes();
    }


    @Test
    public void moveZeroes() {
        int[] array = {0, 1, 0, 3, 12};

        moveZeroes.moveZeroes(array);
    }
}