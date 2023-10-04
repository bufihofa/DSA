package main.week5.hackerrank;

import java.util.Stack;


class Queue2Stacks{
    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();
    public void OneToTwo(){
        while(!st1.isEmpty()){
            st2.push(st1.peek());
            st1.pop();
        }
    }
    public void Enqueue(int temp){
        st1.push(temp);
    }
    public void Dequeue(){
        if(st2.isEmpty()) OneToTwo();
        st2.pop();
    }
    public void Print(){
        if(st2.isEmpty()) OneToTwo();
        System.out.println(st2.peek());
    }
}