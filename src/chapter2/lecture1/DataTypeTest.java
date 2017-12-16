package chapter2.lecture1;

import java.util.Scanner;

public class DataTypeTest {

    public static void main(String[] args) {
        /*
        * There are two Data Types in Java
        * Primitive Data Types
        * Object Data Types
        * Objects are mainly multiple primitive data types in a box
        * */
        // Primitive Data Type
        int a = 10;
        double b = 3.14;
        boolean c = true;

        // Object Data Type
        String str = new String("Java");
        Scanner sc = new Scanner(System.in);

        System.out.println(str);
    }
}
