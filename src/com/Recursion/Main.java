package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Recursion part 1.
        /*
        Write a program to print the hello world 5 times without writing hello world 5 times,
        with a function call.
         */
        message();
    }
    static void message(){
        System.out.println("Hello world");
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");
    }
}
/* in this one function is calling another function where the operation is same only
   the name of method is different.
 */
