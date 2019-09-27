package desizn.twoStatckForQueue;

import java.util.Stack;

/**
 * 两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @author Liy
 * @date 2019/7/14
 **/

public class TwoStackQueue {

    private Stack<Object> dataStack = new Stack<>();

    private Stack<Object> tempStack = new Stack<>();

    /**
     * 出队列
     */
    public Object pop() {
        // 首先判断dataStack 是否为空
        if (dataStack.size() == 0) {
            throw new EmptyException("空的");
        }

        while (dataStack.size() != 1) {
            Object tempObject = dataStack.pop();
            tempStack.push(tempObject);
        }

        Object targetObject = dataStack.pop();

        while (tempStack.size() != 0) {
            dataStack.push(tempStack.pop());
        }
        return targetObject;
    }

    /**
     * 进队列
     */
    public void push(Object o) {
        dataStack.push(o);
    }
}

class EmptyException extends RuntimeException{
    EmptyException(String message) {
        super(message);
    }
}