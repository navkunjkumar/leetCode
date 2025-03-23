package org.example;

import java.util.HashMap;
import java.util.Stack;

public class StackProblems {

    public boolean isValid(String s) {
        HashMap<Character, Character> closingBracket = new HashMap<>();
        closingBracket.put(')', '(');
        closingBracket.put('}', '{');
        closingBracket.put(']','[');
        Stack<Character> stack  = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(closingBracket.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closingBracket.get(c)){
                    stack.pop();
                }else return false;
            } else stack.push(c);
        } return stack.isEmpty();
    }
}
