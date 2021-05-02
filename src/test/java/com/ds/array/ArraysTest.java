package com.ds.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
    int[] arr=new int[5];

    @BeforeEach
    void setUp() {
        arr= new int[]{1, 2, 3, 4, 5};
    }

    @Test
    void reverse() {
        Arrays.reverse(arr);
    }
}