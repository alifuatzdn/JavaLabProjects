package stack;
import java.util.ArrayList;

public class StackArrayImpl implements Stack{
    public ArrayList stack = new ArrayList();

    @Override
    public void push(Object item) {
        stack.add(item);
    }

    @Override
    public Object pop() {
        if (empty()) {
            throw new IllegalStateException("The stack is empty!");
        }
        return stack.removeLast();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }
}
