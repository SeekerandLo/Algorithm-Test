package datastructure.tree.testEntity;

/**
 * data: 2019/6/3 11:33
 **/

public class TestModel implements Comparable<TestModel> {
    private int val;

    private String name;

    @Override
    public int compareTo(TestModel o) {
        if (val > o.val) {
            return 1;
        }
        return 0;
    }
}
