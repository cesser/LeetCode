package com.company;

public class Main {
    /*Given an array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? */
    public static void main(String[] args) {
	// write your code here
        int[] array = {1, 3, 4, 1, 3};
        int result = singleNumber(array);
    }

    public static int singleNumber(int[] A) {
        int result = 0;

        if(A == null || A.length == 0) {
            return result;
        }

        for (int i= 0; i<A.length; i++)
        {
            result = result ^ A[i];
        }

        return result;
    }
}
