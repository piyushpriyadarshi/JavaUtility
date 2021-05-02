package com.ds.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTestString {

    LinkedList linkedList;
    @BeforeEach
    void setUp() {
        linkedList=new LinkedList<String>();
    }

    @Test
    void insert() {
        linkedList.insert("imp");
        linkedList.insert("data");
        linkedList.insert("structures");
        linkedList.insert(10);
        System.out.println(linkedList.getSize());
        System.out.println(linkedList);

    }
}