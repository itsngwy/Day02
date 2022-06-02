package myapp.core;

import java.util.*;

public class DataStructures {

    public static void main(String[] args) {

        // Create a list of integers
        // List - generics
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(2, 15);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {

            System.out.printf("%d = %d\n", i , intList.get(i));
        }

    }
    
}
