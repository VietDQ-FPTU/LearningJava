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
public class Main {

    public static void main(String[] args) {
        while (true) {
            menu();
            int optionInput = Input.option("Enter your base number input: ");
            int optionOutput = Input.option("Enter your base number output: ");
            String value = Input.value(optionInput);
            ChangeBaseNumber.Change(optionInput, optionOutput, value);
        }
    }

    private static void menu() {
        System.out.println("1: Binary");
        System.out.println("2: Decimal");
        System.out.println("3: Hexadecimal");
        System.out.println("4: Exit");
    }


}
