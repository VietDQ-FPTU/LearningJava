/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change_base;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class Input {

    static int option(String mess) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mess);
                int input = Integer.parseInt(scanner.nextLine());
                if (input <= 0 || input > 4) {
                    System.out.println("Your option need greater than 0 and less than 5");
                } else if (input == 4) {
                    System.exit(0);
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat! try again");
            }
        }
    }

    static String value(int optionInput) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the value input: ");
            String input = scanner.nextLine();
            switch (optionInput) {
                case 1:
                    if (input.matches("^[0-1]+$")) {
                        return input;
                    } else {
                        System.out.println("Your value wrong fomat");
                        continue;
                    }
                case 2:
                    if (input.matches("^[0-9]+$")) {
                        return input;
                    } else {
                        System.out.println("Your value wrong fomat");
                        continue;
                    }
                case 3:
                    if (input.matches("^[0-9A-F]+%")) {
                        return input;
                    } else {
                        System.out.println("Your value wrong fomat");
                    }
            }
        }
    }

}
