package com.ds.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList linkedList;
    @BeforeEach
    void setUp() {
        linkedList=new LinkedList<Integer>();
    }

    @Test
    void insert() {
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40,1);
        System.out.println(linkedList.getSize());
        System.out.println(linkedList);

    }

    @Test
    void testInsert() {
    }
}