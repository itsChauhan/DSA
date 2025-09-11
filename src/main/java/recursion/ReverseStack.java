package recursion;

import java.util.Stack;

public class ReverseStack {

    public static void insertAtLast(Stack<Integer> stack, Integer k){
        if(stack == null)
            stack = new Stack<>();
        if(stack.empty()) {
            stack.push(k);
            return;
        }
        Integer element = stack.pop();
        insertAtLast(stack,k);
        stack.push(element);
    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack == null || stack.empty() || stack.size() == 1)
            return;
        Integer element = stack.pop();
        reverseStack(stack);
        insertAtLast(stack,element);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(0);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
}
