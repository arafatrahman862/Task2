
package oop.task2;

import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {
        Scanner  x = new Scanner(System.in);
        Scanner  y = new Scanner(System.in);
       double a , b;
       double sum,sub,mul,div;
        System.out.print("Enter 1st number : ");
       a = x.nextDouble();
          System.out.print("Enter 2nd number : ");
       b = y.nextDouble();
       sum = a+b;
       sub  = a-b;
       mul = a*b;
       div = a/b;
        System.out.println("Summation = "+sum);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
    }
}
