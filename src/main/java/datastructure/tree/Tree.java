package datastructure.tree;

import java.util.Collections;
import java.util.List;

public interface Tree<E> {

    /**
     * 清空
     */
    void destroy();

    /**
     * 添加元素
     */
    void add(E e);

    /**
     * 删除元素
     */
    boolean remove(E e);

    /**
     * 获取根节点
     */
    E getRoot();


}
