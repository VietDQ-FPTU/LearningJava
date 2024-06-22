/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0050;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
class GetValue {

    static int enterOption() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Please choice one option: ");
                int option = Integer.parseInt(sc.nextLine());
                if (option >= 0 && option <= 3) {
                    return option;
                } else {
                    System.out.println("Your option need great than 0 and less than 4");
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat!");
            }
        }
    }

    static double getNumber(String sNumber) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter " + sNumber + ": ");
                double number = Double.parseDouble(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        }
    }

}
