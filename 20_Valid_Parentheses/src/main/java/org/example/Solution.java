package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (var c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (stack.isEmpty())
                    return false;
            else if ((stack.peek() == '(' && c == ')') ||
                     (stack.peek() == '[' && c == ']') ||
                     (stack.peek() == '{' && c == '}'))
                stack.pop();
            else
                return false;
        }

         return stack.isEmpty();
    }
}