package datastructure.tree;

public interface Tree<E> {

    void destroy();

    void add(E e);

    boolean remove(E e);

    E getRoot();

}
