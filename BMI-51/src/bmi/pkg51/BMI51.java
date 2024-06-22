/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.pkg51;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class BMI51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 or 2");
        int option = Integer.parseInt(sc.nextLine());
        if (option == 1) {
            calculator();
        } else {
            bmi();
        }
    }

    private static void calculator() {
        Scanner sc = new Scanner(System.in);
        double memory;
        char operation;
        System.out.println("enter nb");
        memory = enterNumber();
        while (true) {
            System.out.println("enter op");
            operation = enterOperation();
            if (operation == '+') {
                memory += enterNumber();
            } else if (operation == '-') {
                memory += enterNumber();
            } else if (operation == '*') {
                memory += enterNumber();
            } else if (operation == '/') {
                memory += enterNumber();
            } else if (operation == '^') {
                memory += enterNumber();
            } else if (operation == '=') {
                break;
            }
        }
        System.out.println("result: " + memory);
    }

    private static double bmi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static char enterOperation() {
        Scanner sc = new Scanner(System.in);
        while (true) {            
            try {
                 String x = sc.nextLine();
                 if (x.length() == 1) {
                     char y = x.charAt(0);
                     if (y == '+' || y == '-' || y == '*' || y == '/' || y == '^' || y == '=' ) {
                         return y;
                     } else {
                         System.out.println("pl again");
                     }
                 } else {
                     System.out.println("again");
                 }
            } catch (Exception e) {
                System.out.println("again");
            }
        }
    }

    private static double enterNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double x = Double.parseDouble(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("again");
            }
        }
    }

}
