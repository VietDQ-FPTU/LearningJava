/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0050_ptb1_ptb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class P0050_PTB1_PTB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            // menu
            menu();
            // enter option
            int option = enterOption();
            // call funtion following option
            if (option == 1) {
                superlativeEquation();
            } else if (option == 2) {
                quadraticEquation();
            } else {
                System.exit(0);
            }
        }
    }

    private static void menu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    private static int enterOption() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Please choice one option: ");
                int option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 3) {
                    return option;
                } else {
                    System.out.println("Option need great than 0 and less than 4!");
                }
            } catch (Exception e) {
                System.out.println("Enter is a number!");
            }
        }
    }

    private static void superlativeEquation() {
        System.out.println();
        System.out.println("----- Calculate Equation -----");
        double numberA, numberB;
        do {
            numberA = enterNumberABC("A");
            numberB = enterNumberABC("B");
            if (numberA == 0) {
                System.out.println("Coefficients A can't equal 0");
            }
        } while (numberA == 0);
        double solution = -numberB / numberA;
        System.out.println("Solution: x = " + solution);
        List<Double> listNumber = new ArrayList<>();
        listNumber.add(numberA);
        listNumber.add(numberB);
        listNumber.add(solution);
        checkNumberType(listNumber);
    }

    private static void quadraticEquation() {
        System.out.println();
        System.out.println("----- Calculate Equation -----");
        double numberA, numberB, numberC;
        do {
            numberA = enterNumberABC("A");
            numberB = enterNumberABC("B");
            numberC = enterNumberABC("C");
            if (numberA == 0 && numberB == 0) {
                System.out.println("Both Coefficients A and B can't equal 0 simultaneously");
            }
        } while (numberA == 0 && numberB == 0);
        if (numberA == 0) {
            double solution = -numberB / numberC;
            System.out.println("Solution: x = " + solution);
            List<Double> listNumber = new ArrayList<>();
            listNumber.add(numberA);
            listNumber.add(numberB);
            listNumber.add(numberC);
            listNumber.add(solution);
            checkNumberType(listNumber);
        } else {
            double delta = Math.pow(numberB, 2) - (4 * numberA * numberC);
            if (delta < 0) {
                System.out.println("Solution: no solution");
                List<Double> listNumber = new ArrayList<>();
                listNumber.add(numberA);
                listNumber.add(numberB);
                listNumber.add(numberC);
                checkNumberType(listNumber);
            } else if (delta == 0) {
                double solution1 = -numberB / (2 * numberA);
                double solution2 = -numberB / (2 * numberA);
                System.out.println("Solution: x1 = " + solution1 + " and x2 = " + solution2);
                List<Double> listNumber = new ArrayList<>();
                listNumber.add(numberA);
                listNumber.add(numberB);
                listNumber.add(numberC);
                listNumber.add(solution1);
                listNumber.add(solution2);
                checkNumberType(listNumber);
            } else if (delta > 0) {
                double solution1 = (-numberB + delta) / (2 * numberA);
                double solution2 = (-numberB - delta) / (2 * numberA);
                System.out.println("Solution: x1 = " + solution1 + "and x2 = " + solution2);
                List<Double> listNumber = new ArrayList<>();
                listNumber.add(numberA);
                listNumber.add(numberB);
                listNumber.add(numberC);
                listNumber.add(solution1);
                listNumber.add(solution2);
                checkNumberType(listNumber);
            }
        }
    }

    private static double enterNumberABC(String coefficient) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter " + coefficient + ": ");
                double value = Double.parseDouble(sc.nextLine());
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        }
    }

    private static void checkNumberType(List<Double> listNumber) {
        String numberOdd = "", numberEven = "", numberPerfectSquare = "";
        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) % 2 != 0) {
                numberOdd += String.valueOf(listNumber.get(i)) + ", ";
            } else if (listNumber.get(i) % 2 == 0) {
                numberEven += String.valueOf(listNumber.get(i)) + ", ";
            }
        }
        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) > 0 && Math.sqrt(listNumber.get(i)) == Math.floor(Math.sqrt(listNumber.get(i)))) {
                numberPerfectSquare += String.valueOf(listNumber.get(i)) + ", ";
            }
        }
        if (numberOdd.length() > 0) {
            numberOdd = numberOdd.substring(0, numberOdd.length() - 2);
        }
        if (numberEven.length() > 0) {
            numberEven = numberEven.substring(0, numberEven.length() - 2);
        }
        if (numberPerfectSquare.length() > 0) {
            numberPerfectSquare = numberPerfectSquare.substring(0, numberPerfectSquare.length() - 2);
        }
        System.out.println("Number is Odd:" + numberOdd);
        System.out.println("Number is Even:" + numberEven);
        System.out.println("Number is Perfect Square:" + numberPerfectSquare);
        System.out.println();
    }

}
