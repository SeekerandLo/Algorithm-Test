package math.isRobotBounded;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsRobotBoundedTest {

    IsRobotBounded isRobotBounded;

    @Before
    public void init() {
        isRobotBounded = new IsRobotBounded();
    }

    @Test
    public void isRobotBounded() {
        String instructions = "GGLLGG";

        boolean expect = true;

        boolean actual = isRobotBounded.isRobotBounded(instructions);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isRobotBounded_test2() {
        String instructions = "GL";

        boolean expect = true;

        boolean actual = isRobotBounded.isRobotBounded(instructions);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isRobotBounded_test3() {
        String instructions = "GLRLLGLL";

        boolean expect = true;

        boolean actual = isRobotBounded.isRobotBounded(instructions);

        Assert.assertEquals(expect, actual);
    }
}