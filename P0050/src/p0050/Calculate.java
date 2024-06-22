/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0050;

/**
 *
 * @author Thinkpad
 */
class Calculate {

    static void superlativeEquation() {
        double firstNumber = GetValue.getNumber("A");
        double secondNumber = GetValue.getNumber("B");
        String result;

        if (firstNumber == 0) {
            if (secondNumber == 0) {
                result = "Infinite solutions";
            } else {
                result = "No solution";
            }
        } else {
            result = Double.toString(-secondNumber / firstNumber);
        }
        System.out.println("Solution: x = " + result);
        checkNumberIsOdd(firstNumber, secondNumber, result);
        checkNumberIsEven(firstNumber, secondNumber, result);
        checkNumberIsPerfectSquare(firstNumber, secondNumber, result);
    }

    static void quadraticEquation() {
        double firstNumber = GetValue.getNumber("A");
        double secondNumber = GetValue.getNumber("B");
        double thirtNumber = GetValue.getNumber("C");
        double result1;
        double result2;
        double delta;
        String result = "";

        if (firstNumber == 0) {
            if (secondNumber == 0 && thirtNumber == 0) {
                result = "Infinite solution";
            } else if (secondNumber == 0 && thirtNumber != 0) {
                result = "No solution";
            } else if (secondNumber != 0) {
                result = Double.toString(-thirtNumber / secondNumber);
            }
            System.out.println("Solution: x = " + result);
            checkNumberIsOdd(firstNumber, secondNumber, result);
            checkNumberIsEven(firstNumber, secondNumber, result);
            checkNumberIsPerfectSquare(firstNumber, secondNumber, result);
        } else {
            delta = Math.pow(secondNumber, 2) - (4 * firstNumber * thirtNumber);
            if (delta < 0) {
                result = "No solution";
                System.out.println("Solution: x = " + result);
                checkNumberIsOdd(firstNumber, secondNumber, result);
                checkNumberIsEven(firstNumber, secondNumber, result);
                checkNumberIsPerfectSquare(firstNumber, secondNumber, result);
            } else if (delta == 0) {
                result1 = result2 = -secondNumber / (2 * firstNumber);
                System.out.println("Solution: x1 = " + result1 + " and x2 = " + result2);
                checkNumberIsOdd(firstNumber, secondNumber, result1, result2);
                checkNumberIsEven(firstNumber, secondNumber, result1, result2);
                checkNumberIsPerfectSquare(firstNumber, secondNumber, result1, result2);
            } else if (delta > 0) {
                result1 = (-secondNumber + Math.sqrt(delta)) / (2 * firstNumber);
                result2 = (-secondNumber - Math.sqrt(delta)) / (2 * firstNumber);
                System.out.println("Solution: x1 = " + result1 + " and x2 = " + result2);
                checkNumberIsOdd(firstNumber, secondNumber, result1, result2);
                checkNumberIsEven(firstNumber, secondNumber, result1, result2);
                checkNumberIsPerfectSquare(firstNumber, secondNumber, result1, result2);
            }
        }
    }

    private static void checkNumberIsOdd(double firstNumber, double secondNumber, String result) {
        System.out.print("Number is Odd:");
        if (firstNumber % 2 != 0) {
            System.out.print(firstNumber);
            if (secondNumber % 2 != 0) {
                System.out.print(", ");
            }
        }
        if (secondNumber % 2 != 0) {
            System.out.print(secondNumber);
            if (checkIsNumber(result) && Double.parseDouble(result) % 2 != 0) {
                System.out.print(", ");
            }
        }
        if (checkIsNumber(result) && Double.parseDouble(result) % 2 != 0) {
            System.out.print(result);
        }
        System.out.println("");
    }

    private static void checkNumberIsEven(double firstNumber, double secondNumber, String result) {
        System.out.print("Number is Even:");
        if (firstNumber % 2 == 0) {
            System.out.print(firstNumber);
            if (secondNumber % 2 == 0) {
                System.out.print(", ");
            }
        }
        if (secondNumber % 2 == 0) {
            System.out.print(secondNumber);
            if (checkIsNumber(result) && Double.parseDouble(result) % 2 == 0) {
                System.out.print(", ");
            }
        }
        if (checkIsNumber(result) && Double.parseDouble(result) % 2 == 0) {
            System.out.print(result);
        }
        System.out.println("");
    }

    private static void checkNumberIsPerfectSquare(double firstNumber, double secondNumber, String result) {
        System.out.print("Number is Perfect Square:");
        if (Math.ceil(Math.sqrt(firstNumber)) == Math.floor(Math.sqrt(firstNumber))) {
            System.out.print(firstNumber);
            if (Math.ceil(Math.sqrt(secondNumber)) == Math.floor(Math.sqrt(secondNumber))) {
                System.out.print(", ");
            }
        }
        if (Math.ceil(Math.sqrt(secondNumber)) == Math.floor(Math.sqrt(secondNumber))) {
            System.out.print(secondNumber);
            if (checkIsNumber(result) && Math.ceil(Math.sqrt(Double.parseDouble(result))) == Math.floor(Math.sqrt(Double.parseDouble(result)))) {
                System.out.print(", ");
            }
        }
        if (checkIsNumber(result) && Math.ceil(Math.sqrt(Double.parseDouble(result))) == Math.floor(Math.sqrt(Double.parseDouble(result)))) {
            System.out.print(result);
        }
        System.out.println("");
    }

    private static boolean checkIsNumber(String result) {
        try {
            Double.parseDouble(result);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void checkNumberIsOdd(double firstNumber, double secondNumber, double result1, double result2) {
        System.out.print("Number is Odd:");
        if (firstNumber % 2 != 0) {
            System.out.print(firstNumber);
            if (secondNumber % 2 != 0) {
                System.out.print(", ");
            }
        }
        if (secondNumber % 2 != 0) {
            System.out.print(secondNumber);
            if (result1 % 2 != 0) {
                System.out.print(", ");
            }
        }
        if (result1 % 2 != 0) {
            System.out.print(result1);
            if (result2 % 2 != 0) {
                System.out.print(", ");
            }
        }
        if (result2 % 2 != 0) {
            System.out.print(result2);
        }
        System.out.println("");
    }

    private static void checkNumberIsEven(double firstNumber, double secondNumber, double result1, double result2) {
        System.out.print("Number is Even:");
        if (firstNumber % 2 == 0) {
            System.out.print(firstNumber);
            if (secondNumber % 2 == 0) {
                System.out.print(", ");
            }
        }
        if (secondNumber % 2 == 0) {
            System.out.print(secondNumber);
            if (result1 % 2 == 0) {
                System.out.print(", ");
            }
        }
        if (result1 % 2 == 0) {
            System.out.print(result1);
            if (result2 % 2 == 0) {
                System.out.print(", ");
            }
        }
        if (result2 % 2 == 0) {
            System.out.print(result2);
        }
        System.out.println("");
    }

    private static void checkNumberIsPerfectSquare(double firstNumber, double secondNumber, double result1, double result2) {
        System.out.print("Number is Perfect Square:");
        if (Math.ceil(Math.sqrt(firstNumber)) == Math.floor(Math.sqrt(firstNumber))) {
            System.out.println(firstNumber);
            if (Math.ceil(Math.sqrt(secondNumber)) == Math.floor(Math.sqrt(secondNumber))) {
                System.out.println(", ");
            }
        }
        if (Math.ceil(Math.sqrt(secondNumber)) == Math.floor(Math.sqrt(secondNumber))) {
            System.out.println(secondNumber);
            if (Math.ceil(Math.sqrt(result1)) == Math.floor(Math.sqrt(result1))) {
                System.out.println(", ");
            }
        }
        if (Math.ceil(Math.sqrt(result1)) == Math.floor(Math.sqrt(result1))) {
            System.out.println(result1);
            if (Math.ceil(Math.sqrt(result2)) == Math.floor(Math.sqrt(result2))) {
                System.out.println(", ");
            }
        }
        if (Math.ceil(Math.sqrt(result2)) == Math.floor(Math.sqrt(result2))) {
            System.out.println(result2);
        }
        System.out.println("");
    }

}
