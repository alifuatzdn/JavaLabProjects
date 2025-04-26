package generics;

import shapes.Shape;

public class StackDemo {
    public static void main(String[]args){

        Stack<Object> objectStack = new StackImpl<>();

        objectStack.push(1);
        objectStack.push(2.5);
        objectStack.push("Hello");
        System.out.println(objectStack.toList());

        Stack<String> stringStack = new StackImpl<>();

        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        System.out.println(stringStack.toList());

        objectStack.addAll(stringStack);
        System.out.println(objectStack.toList());

        Stack<Integer> stack2 = new StackArrayImpl<>();
        // stack.pop();11
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);

        Stack<Integer> stack = new StackArrayImpl<>();
        // stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.addAll(stack2);
        System.out.println(stack.toList());
//        while (!stack.empty()){
//            System.out.println(stack.pop());}
    }
}
