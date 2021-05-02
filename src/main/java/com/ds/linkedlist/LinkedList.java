package com.ds.linkedlist;

import com.ds.commons.Node;

public class LinkedList<T> {
    private Node<T> head;
    public void insert(T t){
        this.insert(t,0);
    }
    public void insertAtEnd(T t){
        int size=this.getSize();
        this.insert(t,size);
    }
    public void insert(T t,int index){
        Node<T> currentNode=new Node<T>(t);
        if(index==0){
            if(this.getHead()!=null){
                currentNode.setNext(this.getHead());
            }
            this.head=currentNode;
        }
        else{
            int position=0;
            Node temp=this.head;
            while(position!=index-1){
                temp=temp.getNext();
            }
            currentNode.setNext(temp.getNext());
            temp.setNext(currentNode);
        }
    }
    public void delete(T t){

    }
    public int getSize(){
        int size=0;
        Node temp=this.head;
        while(temp!=null){
            size+=1;
            temp=temp.getNext();
        }
        return size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public String toString() {
        StringBuffer str=new StringBuffer("");
        Node currentNode=this.getHead();
        while(currentNode!=null){
            str.append(currentNode.getData());
            currentNode=currentNode.getNext();
            if(currentNode!=null){
                str.append("->");
            }
        }
        return str.toString();
    }
}



