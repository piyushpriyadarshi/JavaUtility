package com.ds.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

//    @Test
//    public void binarySearchTest(){
//        int[] arr={1,2,3,4,5,6};
//        assertEquals(BinarySearch.binarySearch(arr,4),3);
//    }

    @Test
    void binarySearchTest() {
        int[] arr={1,2,3,4,5,6};
        assertEquals(BinarySearch.binarySearch(arr,4),3);
    }
    @Test
    void binarySearchTest1() {
        int[] arr={1,2,3,4,5,6};
        assertEquals(BinarySearch.binarySearch(arr,4),3);
    }

    @Test
    void leftMostindex() {
        int[] arr={0,0,0,1,1,1,1,1};
        assertEquals(BinarySearch.leftMostindex(arr,1),3);
        assertEquals(BinarySearch.leftMostindex(arr,0),0);
    }
}