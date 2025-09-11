package stack;

import java.util.Stack;

public class ValidParenthesis {



    private static boolean doesContainValidParenthesis(String s){
        if(s==null || s.isEmpty()){
            return true;
        }

        Stack<Character> stk = new Stack<>();
        for(Character c : s.toCharArray()){
            if(!stk.empty() && isCorrespondingOppositeParenthesis(c,stk.peek())){
                stk.pop();
                continue;
            }
            stk.push(c);
        }

        return stk.empty();
    }

    private static boolean isCorrespondingOppositeParenthesis(Character top, Character beforeCharacter){
        switch (top){
            case '}' -> {
                return beforeCharacter.equals('{');
            }
            case ']' -> {
                return beforeCharacter.equals('[');
            }
            case ')' -> {
                return beforeCharacter.equals('(');
            }
            default -> {
                return false;
            }
        }
    }




    public static void main(String[] args) {
        System.out.println(doesContainValidParenthesis("{{}{}[]{}}]"));
    }

}


