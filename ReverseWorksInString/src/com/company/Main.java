package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
   /* Given an input string, reverse the string word by word.

            For example,
    Given s = "the sky is blue",
    return "blue is sky the".

    click to show clarification.

    Clarification:
    What constitutes a word?
    A sequence of non-space characters constitutes a word.
    Could the input string contain leading or trailing spaces?
    Yes. However, your reversed string should not contain leading or trailing spaces.
    How about multiple spaces between two words?
    Reduce them to a single space in the reversed string.*/
    public static void main(String[] args) {
	// write your code here

       String input ="the sky is blue";
       System.out.println(reverseWords(input));


    }

    public static String reverseWords(String s) {
        if(s == null)
            return null;
        s = s.trim();

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i=array.length -1; i >= 0; i--)
        {
            String temp = array[i].trim();
            if(temp != null && temp.length() > 0)
            {
                sb.append(temp);
                if(i != 0) {
                    sb.append(" ");
                }
            }
        }

        String result = sb.toString();

        return result;

    }
}
