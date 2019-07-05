package datastructure.array.addToArrayForm;

import datastructure.list.addTwoNumbers.AddTwoNumbers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddToArrayFormTest {

    AddToArrayForm addToArrayForm;

    @Before
    public void init() {
        addToArrayForm = new AddToArrayForm();
    }

    @Test
    public void addToArrayForm() {
        int[] array = {1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm.addToArrayForm(array, k));
    }
}