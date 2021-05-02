package com.ds.stack;

import java.util.ArrayList;

/**
 * Stack is the Linear DataStructure used for
 *
 * Please see the {@link } class for true identity
 * @see <a href="https://piyushpriyadarshi.com">My Portfolio</a>
 * @author Piyush Priyadarshi
 *
 */
public class Stack<T> {
    private ArrayList<T> arr;
    Stack(){
        this(10);
    }
    Stack(int size){
        arr=new ArrayList<T>(size);
    }
    public boolean isEmpty(){
        return arr.isEmpty();
    }
    public boolean isFull(){
        return false;
    }
    public void push(T data){
        if(!this.isFull()){
            arr.add(data);
        }
        else{
            throw new RuntimeException("Stack OverFlow");
        }
    }

    /**
     * <p>This is a simple description of the method. . .
     * <a href="http://www.supermanisthegreatest.com">Superman!</a>
     * </p>
     * @return the amount of health hero has after attack
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     * @since 1.0
     */
    public T pop(){
        if(!this.isEmpty()){
            T data=(T) arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return data;
        }
        else{
            throw new RuntimeException("Stack UnderFlow");
        }

    }
    public T peek(int index){
        return (T) arr.get(index);
    }
}
