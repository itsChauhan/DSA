package recursion;

import java.util.Stack;

public class SortStack {

    public static void sortedInsert(Stack<Integer> stack, Integer x){
        if(stack == null){
            stack = new Stack<>();
        }

        if(stack.empty()){
            stack.push(x);
            return;
        }


        if(stack.peek() < x){
            stack.push(x);
            return;
        }

        Integer next = stack.pop();
        sortedInsert(stack,x);
        stack.push(next);
    }



    public static void sortStack(Stack<Integer> stack){
        if(stack==null || stack.empty())
            return;
        Integer element = stack.pop();
        sortStack(stack);
        sortedInsert(stack,element);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(0);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }
}
