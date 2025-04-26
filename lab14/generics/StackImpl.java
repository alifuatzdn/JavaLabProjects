package generics;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    private StackItem<T> top;

    @Override
    public void push(T item) {
        StackItem<T> newItem = new StackItem<>(item);
        newItem.setNext(top);
        top = newItem;
    }

    @Override
    public T pop() {
        if(empty()) {
            throw new IllegalStateException("The stack is empty!");
        }
        T item = top.getItem();
        top = top.getNext();
        return item;
        // StackItem previousTop = top;
        // top = previousTop.getNext();
        // return previousTop.getItem();
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public List<T> toList() {
        ArrayList<T> list = new ArrayList<>();
        StackItem<T> item = top;

        while (item != null){
            list.add(item.getItem());
            item = item.getNext();
        }
        return list;
    }
}
