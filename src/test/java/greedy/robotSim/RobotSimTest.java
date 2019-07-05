package greedy.robotSim;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotSimTest {

    RobotSim robotSim;

    @Before
    public void init() {
        robotSim = new RobotSim();
    }

    @Test
    public void robotSim() {
        int[] commands = {4, -1, 3};
        int[][] obstacles = {};

        int expect = 25;

        int actual = robotSim.robotSim(commands, obstacles);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void robotSim_test2() {
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};

        int expect = 65;

        int actual = robotSim.robotSim(commands, obstacles);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void sum_test() {
        int dir = 2;

        System.out.println(dir);

    }
}