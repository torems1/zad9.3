package com.company;

import java.util.Arrays;

public class Sort<T> {
    T bufArray[];

    Sort(T... array) {
        bufArray = array;
    }

    public void SortArray() {
        Arrays.sort(bufArray);
    }

    public void PrintArray() {
        for (T t : bufArray) {
            System.out.println(t + " ");
        }
        System.out.println();
    }
}
