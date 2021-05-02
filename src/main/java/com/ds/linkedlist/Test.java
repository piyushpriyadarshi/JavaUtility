package com.ds.linkedlist;

import com.ds.commons.Node;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        Node prev=null;
        Node current=ll.getHead();
        Node next=null;
        System.out.println(ll.toString());
        while(current!=null){
            next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
            ll.setHead(prev);
        }
        System.out.println(ll.toString());

    }













}
