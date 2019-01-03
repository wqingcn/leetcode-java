package com.mark._20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        if(s.charAt(0) != '(' && s.charAt(0) != '[' && s.charAt(0) != '{'){
            return false;
        }
        Stack<Character> items = new Stack<>();
        int i;
        for(i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                items.push(c);
            } else{
                if(items.isEmpty()){
                    return false;
                }
                char temp = items.pop();
                if(c == ')'){
                    if(temp != '('){
                        return false;
                    }
                }
                if(c == ']'){
                    if(temp != '['){
                        return false;
                    }
                }
                if(c == '}'){
                    if(temp != '{'){
                        return false;
                    }
                }
            }
        }
        return items.isEmpty();
    }
    public static void main(String [] args){
        String s1 = "()]";
        String s2 = "";
        String s3 = "()";
        String s4 = "(";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
        System.out.println(solution.isValid(s4));
    }
}
