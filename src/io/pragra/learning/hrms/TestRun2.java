package io.pragra.learning.hrms;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class TestRun2 {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Key in Number 1 ");
        int num1  = scanner.nextInt();
        System.out.println("Key in Number 2 ");
        int num2 = scanner.nextInt();

        try {
            System.out.println("Division is "  +  num1/num2);
        }catch (ArithmeticException exception) {
            System.out.println(exception.getCause());
            //exception.printStackTrace();
            System.out.println(" [ERROR]---Key in number as non 0 value again");
        }
        num2 = scanner.nextInt();
        System.out.println("Division is "  +  num1/num2);

    }

    static void anotherMethod(){
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        try {
            System.out.println(2/0);
            System.out.println("ABC");
        }catch (ArithmeticException ex) {

        }catch (InputMismatchException ex) {

        }catch (Exception ex) {

        }
        System.out.println("Line 5");
        System.out.println("Line 6");
        System.out.println("Line 7");
        System.out.println("Line 8");
    }
}
