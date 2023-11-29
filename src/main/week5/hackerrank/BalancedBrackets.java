package main.week5.hackerrank;

import java.util.Stack;

class BalancedBrackets {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(c == ')') c = '(';
                if(c == ']') c = '[';
                if(c == '}') c = '{';
                if(st.isEmpty()){
                    return "NO";
                }
                else if(st.peek() != c){
                    return "NO";
                }
                else st.pop();
            }
        }
        if(st.isEmpty()) return "YES";
        else return "NO";

    }

}

