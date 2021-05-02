package com.ds.stack;

public class BalanceParenthesis {

    public boolean isBalanced(String expression){
        Stack<Character> stack=new Stack(10);
        char[] expressionArr=expression.toCharArray();
        for (int i = 0; i < expressionArr.length; i++) {
            if(expressionArr[i]=='('|| expressionArr[i]=='{'||expressionArr[i]=='[' ){
                switch (expressionArr[i]){
                    case '{':
                        stack.push('}');
                        break;
                    case '(':
                        stack.push(')');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                }
            }
            else{
                Character ch=stack.pop();
                if (ch!=expressionArr[i]){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
