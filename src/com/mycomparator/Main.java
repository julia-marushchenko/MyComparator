/**
 *  Java program to compare objects.
 */

package com.mycomparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  Customer class.
 */
class Customer {

    // Fields of the class.
    int id;
    String name;

    // Constructor of the class.
    public Customer(int id, String name) {

        this.id = id;
        this.name = name;

    }

}

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Creating collection of Customers.
        ArrayList<Customer> list = new ArrayList<>();

        // Adding objects to list.
        list.add(new Customer(2, "Elke"));
        list.add(new Customer(1, "Kie"));

        // Sorting customers.
        Collections.sort(list, (o1, o2) -> o1.id - o2.id);

        // Printing sorted list to console.
        for (Customer element : list) {

            System.out.println(element.id + " " + element.name);
        }

    }
}