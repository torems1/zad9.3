package com.company;

public class Main {

    public static void main(String[] args) {
        Sort<Float> sort1 = new Sort<Float>(1.3f,4.3f,6.3f,3.1f);
        Sort<Integer> sort2 = new Sort<Integer>(1,4,6,3);

        sort1.SortArray();
        sort2.SortArray();

        sort1.PrintArray();
        sort2.PrintArray();
    }
}
