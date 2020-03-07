package com.company;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class testsort {
    @Test
    public void testsort(){
        int [] array ={4,5,7,0,1,3};
        Arrays.sort(array);
        int []  sortedarray ={0,1,3,4,5,7};
        assertArrayEquals(array,sortedarray);
    }
}
