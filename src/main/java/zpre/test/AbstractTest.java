package zpre.test;

/**
 * @author Liy
 * @date 2019/7/13
 **/

public abstract class AbstractTest {

    private static final int a = 3;

    public static void testA() {
        int b = 1;
        System.out.println(a);
    }


    protected abstract void rewrite();

}
