/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Use loop until user want exit
        while (true) {
            // diplay menu
            displayMenu();
            //Select option
            int option = enterOption();
            //Use swith-case to run funtion according user option
            switch (option) {
                case 1:
                    // call funtion to calculator normal 
                    normalCalculator();
                    break;
                case 2:
                    // Call funtion to calculator bmi
                    bmiCalculator();
                    break;
                case 3:
                    // exit
                    System.exit(0);
            }
        }
    }

    private static void displayMenu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.println("Please choice one option:");
    }

    private static int enterOption() {
        Scanner scanner = new Scanner(System.in);
        int option;
        // use loop until user enter correct fomat option
        while (true) {
            try {
                option = Integer.parseInt(scanner.nextLine());
                // use if-else to check limit option
                if (option >= 1 && option <= 3) {
                    return option;
                } else {
                    System.out.println("Your option need greater than 0 and less than 4, try again!");
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat, try again");
            }
        }
    }

    private static void normalCalculator() {
        double memory = 0;
        String mathOperation;
        boolean checkFirst = true;
        System.out.println("----- Normal Calculator -----");

        while (true) {
            if (checkFirst) {
                checkFirst = false;
                memory = enterNumber();
            }
            mathOperation = enterMathOperation();
            if (mathOperation == "+") {
                memory += enterNumber();
                System.out.println("Memory:" + memory);
            } else if (mathOperation == "-") {
                memory -= enterNumber();
                System.out.println("Memory:" + memory);
            } else if (mathOperation == "*") {
                memory *= enterNumber();
                System.out.println("Memory:" + memory);
            } else if (mathOperation == "/") {
                memory /= enterNumber();
                System.out.println("Memory:" + memory);
            } else if (mathOperation == "^") {
                memory = Math.pow(memory, enterNumber());
                System.out.printf("Memory: %.2f\n", memory);
            } else if (mathOperation == "=") {
                System.out.printf("Result: %.2f\n", memory);
                break;
            }
        }
    }

    private static void bmiCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number people: ");
        int x = scanner.nextInt();
        List<People> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.println("enter weight:" + (i + 1));
            double weight = scanner.nextDouble();
            System.out.println("enter height:" + (i + 1));
            double height = scanner.nextDouble();
            People y = new People(height, weight);
            list.add(y);
        }

//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = 0; j < list.size() - i -2; j++) {
//                if (list.get(j).bmi1() > list.get(j + 1).bmi1()) {
//                    People stemp = list.get(j);
//                    list.set(j, list.get(j + 1));
//                    list.set((j + 1), stemp);
//                }
//            }
//        }

        Collections.sort(list, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return (int) (o1.bmi1() - o2.bmi1());
            }
        }); 

        
        for (int i = 0; i < x; i++) {
            list.get(i).bmi();
        }
    }

    private static double enterNumber() {
        Scanner scanner = new Scanner(System.in);
        Double input;
        // use loop until user enter number
        while (true) {
            try {
                System.out.print("Enter number: ");
                input = Double.parseDouble(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println("Your enter wrong fomat");
            }
        }
    }

    private static String enterMathOperation() {
        Scanner scanner = new Scanner(System.in);
        String input;
        //use loop until user enter correct fomat operation
        while (true) {
            System.out.print("Enter Operator: ");
            input = scanner.nextLine();
            if (input.trim().equals("+")) {
                return "+";
            } else if (input.trim().equals("-")) {
                return "-";
            } else if (input.trim().equals("*")) {
                return "*";
            } else if (input.trim().equals("/")) {
                return "/";
            } else if (input.trim().equals("^")) {
                return "^";
            } else if (input.trim().equals("=")) {
                return "=";
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
        }
    }

    private static double enterWeight() {
        Scanner scanner = new Scanner(System.in);
        double input;
        while (true) {
            try {
                System.out.print("Enter Weight(kg): ");
                input = Double.parseDouble(scanner.nextLine());
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("bmi is positive number");
                }
            } catch (Exception e) {
                System.out.println("BMI is digit");
            }
        }
    }

    private static double enterHeight() {
        Scanner scanner = new Scanner(System.in);
        double input;
        while (true) {
            try {
                System.out.print("Enter Height(cm): ");
                input = Double.parseDouble(scanner.nextLine());
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("bmi is positive number");
                }
            } catch (Exception e) {
                System.out.println("BMI is digit");
            }
        }
    }

    private static double calculatorBMI(double weight, double height) {
        return (double) (weight / (height * height));
    }

    private static void displayTheNotification(double bmiNumber) {
        System.out.printf("BMI Number: %.2f\n", bmiNumber);
        if (bmiNumber < 19) {
            System.out.println("BMI Status: Under-standard");
        } else if (bmiNumber >= 19 && bmiNumber < 25) {
            System.out.println("BMI Status: Standard");
        } else if (bmiNumber >= 25 && bmiNumber < 30) {
            System.out.println("BMI Status: Overweight");
        } else if (bmiNumber >= 30 && bmiNumber <= 40) {
            System.out.println("BMI Status: Fat - should lose weight");
        } else {
            System.out.println("BMI Status: Very fat ");
        }
    }

}
