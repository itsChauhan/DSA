package recursion;

import java.util.Stack;

public class DeleteMiddleElementOfStack {

    public static void deleteElementOfStack(Stack<Integer> stack, Integer k){
        if(stack == null || stack.empty())
            return;
        if(k==1){
            stack.pop();
            return;
        }
        Integer element = stack.pop();
        deleteElementOfStack(stack,k-1);
        stack.push(element);
    }


    public static void deleteMiddleElementOfStack(Stack<Integer> stack){
        if(stack==null || stack.empty())
            return;

        int k = stack.size()/2 + 1;
        deleteElementOfStack(stack,k);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(0);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        deleteMiddleElementOfStack(stack);
        System.out.println(stack);
    }
}
