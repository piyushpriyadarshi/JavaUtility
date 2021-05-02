package com.ds.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;
    @BeforeEach
    void setUp() {
        stack=new Stack(10);
    }

    @Test
    void isEmpty() {
        assertEquals(stack.isEmpty(),true);
    }

    @Test
    void isFull() {
        assertEquals(stack.isFull(),false);
    }

    @Test
    void push() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(stack.peek(0),10);
        assertEquals(stack.peek(1),20);
        assertEquals(stack.peek(2),30);

    }

    @Test
    void pop() {
        stack.push(100);
        stack.push(200);
        stack.push(300);
        assertEquals(stack.pop(),300);
    }

    @Test
    void popNegativeTest() {
        //assertEquals(stack.pop(),300);
        assertThrows(RuntimeException.class,()->{
            stack.pop();
        });
    }
    @Test
    void peek() {
        stack.push(100);
        stack.push(200);
        stack.push(300);
        assertEquals(stack.peek(0),100);
        assertEquals(stack.peek(1),200);
        assertEquals(stack.peek(2),300);
    }
}