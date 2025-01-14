package com.awesome.dsa.stack;

import java.util.Stack;

public class BracketValidator {

    public static void main(String[] args) {

        String input = "[()]{}{[()()]()}";
        boolean isValid = isValidBrackets(input);
        System.out.println("isValidBrackets : "+isValid);
    }

    public static boolean isValidBrackets(String input) {
        char[] inputChar = input.toCharArray();
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < inputChar.length; i++) {
            System.out.println("inputChar: "+inputChar[i]);
            if (inputChar[i] == '{'
                    || inputChar[i] == '('
                    || inputChar[i] == '[') {
                charStack.push(inputChar[i]);
            } else {
                if (!charStack.isEmpty()
                        && (charStack.peek() == '{' && inputChar[i] == '}'
                        || charStack.peek() == '[' && inputChar[i] == ']'
                        || charStack.peek() == '(' && inputChar[i] == ')')) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
