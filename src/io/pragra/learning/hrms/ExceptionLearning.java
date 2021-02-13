package io.pragra.learning.hrms;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLearning {
    public static void main(String[] args) {

//        try {
//
//            try {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Key in numner");
//                int num = scanner.nextInt();
//                System.out.println("Number is " + num);
//            }catch (ArithmeticException ex) {
//                System.out.println("Handled Arithmetic");
//            }
//
//        }catch (NumberFormatException ex) {
//            System.out.println("Found Number format");
//        }catch (InputMismatchException ex) {
//            System.out.println("Found wrong input");
//        }
//
        InputStream stream1 = null;
        try {
            System.out.println("Hello");
            System.out.println(2/0);
             stream1 = new FileInputStream("Abc.txt");

        }catch (InputMismatchException ex) {

        }catch (NumberFormatException ex){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            System.out.println("logout");
            try {
                stream1.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        // resource oriented try catch
        try (InputStream stream = new FileInputStream("Abc.txt"))  {
                stream.read();
        }catch (Exception exception) {

        }

    }
}
