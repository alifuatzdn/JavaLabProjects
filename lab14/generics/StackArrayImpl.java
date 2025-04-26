package generics;

import java.util.ArrayList;
import java.util.List;

public class StackArrayImpl<T> implements Stack<T> {
    ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        if (empty()) {
            throw new IllegalStateException("The stack is empty!");
        }
        return stack.removeLast();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public List<T> toList() {
        return stack.reversed();
    }
}
