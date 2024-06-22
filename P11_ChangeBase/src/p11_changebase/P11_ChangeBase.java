/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_changebase;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class P11_ChangeBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            menu();
            int input = enterOption("input");
            int output = enterOption("output");
            String value = enterValue(input);
            String valueAfterChange = ChangeBase.changeBase(input, output, value);
            displayValueAfterChange(valueAfterChange);
        }
    }

    private static void menu() {
        System.out.println("1 Binary");
        System.out.println("2 Decimal");
        System.out.println("3 HexaDecimal");
    }

    private static int enterOption(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mess);
        return sc.nextInt();
    }

    private static String enterValue(int input) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("value: ");
            String value = sc.nextLine();
            if (input == 1) {
                if (value.matches("^[01]+(\\.[01]+)?$")) {
                    return value;
                } else {
                    System.out.println("ngu");
                }
            } else if (input == 2) {
                if (value.matches("^[0-9]+(\\.[0-9]+)?$")) {
                    return value;
                } else {
                    System.out.println("ngu");
                }
            } else if (input == 3) {
                if (value.matches("^[0-9A-F]+(\\.[0-9A-F]+)?$")) {
                    return value;
                } else {
                    System.out.println("ngu");
                }
            } else if (input == 4) {
                System.exit(0);
            }
        }
    }

    private static void displayValueAfterChange(String valueAfterChange) {
        System.out.println("result: " + valueAfterChange);
    }

}
