/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change_base;

/**
 *
 * @author Thinkpad
 */
public class ChangeBaseNumber {

    static void Change(int optionInput, int optionOutput, String value) {
        if (optionInput == 1) {
            if (optionOutput == 1) {
                System.out.println("Result: " + value);
                System.out.println("");
            } else if (optionOutput == 2) {
                changeBinaryToDecimal(value);
                System.out.println("");
            } else {
                changeBinaryToHexadecimal(value);
                System.out.println("");
            }
        } else if (optionInput == 2) {
            if (optionOutput == 1) {
                changeDicimalToBinary(value);
                System.out.println("");
            } else if (optionOutput == 2) {
                System.out.println("Result: " + value);
                System.out.println("");
            } else {
                changeDecimalToHexadecimal(value);
                System.out.println("");
            }
        } else {
            if (optionOutput == 1) {
                changeHexadecimalToBinary(value);
                System.out.println("");
            } else if (optionOutput == 2) {
                changeHexadecimalToDecimal(value);
                System.out.println("");
            } else {
                System.out.println("Result: " + value);
                System.out.println("");
            }
        }
    }

    private static void changeBinaryToDecimal(String value) {
        int valuex = Integer.parseInt(value);
        int result = 0;
        int count = 0;
        while (valuex != 0) {
            result += (valuex % 10) * Math.pow(2, count);
            count++;
            valuex = valuex / 10;
        }
        System.out.println("Result: " + result);
    }

    private static void changeBinaryToHexadecimal(String value) {
        int valuex = Integer.parseInt(value);
        String result = "";
        int count = 0;
        int temp = 0;
        while (valuex != 0) {
            temp += (valuex % 10) * Math.pow(2, count);
            count++;
            valuex = valuex / 10;
        }
        while (temp != 0) {
            if (temp % 16 >= 0 && temp % 16 <= 9) {
                result = String.valueOf(temp % 16) + result;
            } else if (temp % 16 == 10) {
                result = 'A' + result;
            } else if (temp % 16 == 11) {
                result = 'B' + result;
            } else if (temp % 16 == 12) {
                result = 'C' + result;
            } else if (temp % 16 == 13) {
                result = 'D' + result;
            } else if (temp % 16 == 14) {
                result = 'E' + result;
            } else if (temp % 16 == 15) {
                result = 'F' + result;
            }
            temp = temp / 16;
        }
        System.out.println("Result: " + result);
    }

    private static void changeDicimalToBinary(String value) {
        int valuex = Integer.parseInt(value);
        int result = 0;
        int sp = 1;
        while (valuex != 0) {
            result = result + (valuex % 2) * sp;
            sp *= 10;
            valuex = valuex / 2;
        }
        System.out.println("Result: " + result);
    }

    private static void changeDecimalToHexadecimal(String value) {
        String result = "";
        int temp = Integer.parseInt(value);
        while (temp != 0) {
            if (temp % 16 >= 0 && temp % 16 <= 9) {
                result = String.valueOf(temp % 16) + result;
            } else if (temp % 16 == 10) {
                result = 'A' + result;
            } else if (temp % 16 == 11) {
                result = 'B' + result;
            } else if (temp % 16 == 12) {
                result = 'C' + result;
            } else if (temp % 16 == 13) {
                result = 'D' + result;
            } else if (temp % 16 == 14) {
                result = 'E' + result;
            } else if (temp % 16 == 15) {
                result = 'F' + result;
            }
            temp = temp / 16;
        }
        System.out.println("Result: " + result);
    }

    private static void changeHexadecimalToBinary(String value) {
        int temp = 0;
        int count = 0;
        int index = 0;
        for (int i = value.length() - 1; i >= 0 ; i--) {
            if (value.charAt(index) >= '0' && value.charAt(index) <= '9') {
                temp += Character.getNumericValue(value.charAt(index)) * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'A') {
                temp += 10 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'B') {
                temp += 11 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'C') {
                temp += 12 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'D') {
                temp += 13 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'E') {
                temp += 14 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'F') {
                temp += 15 * Math.pow(16, i);
                count++;
                index++;
            }
        }
        double result = 0;
        int sp = 1;
        while (temp != 0) {
            result = result + (temp % 2) * sp;
            sp *= 10;
            temp = temp / 2;
        }
        System.out.println("Result: " + result);
    }

    private static void changeHexadecimalToDecimal(String value) {
        int temp = 0;
        int count = 0;
        int index = 0;
        for (int i = value.length() - 1; i >= 0 ; i--) {
            if (value.charAt(index) >= '0' && value.charAt(index) <= '9') {
                temp += Character.getNumericValue(value.charAt(index)) * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'A') {
                temp += 10 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'B') {
                temp += 11 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'C') {
                temp += 12 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'D') {
                temp += 13 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'E') {
                temp += 14 * Math.pow(16, i);
                count++;
                index++;
            } else if (value.charAt(index) == 'F') {
                temp += 15 * Math.pow(16, i);
                count++;
                index++;
            }
        }  
        System.out.println("Result: " + temp);
    }

}
