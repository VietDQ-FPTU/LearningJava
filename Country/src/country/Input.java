/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class Input {

    protected static float InputNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        float input;
        // Check fomat input
        while (true) {
            try {
                System.out.println(message);
                input = Float.parseFloat(scanner.nextLine());
                //Check domain input
                if (input <= 0) {
                    System.out.println("Your input need great than or equal to 0, try again!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Your input wrong fomat, try again!");
            }
        }
    }

    protected static String InputCoutryCode(String message, String err, List<EastAsiaCountries> listCountries) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean check = true;
        // check duplicate
        while (check) {
            check = false;
            System.out.println(message);
            input = scanner.nextLine();
            for (int i = 0; i < listCountries.size(); i++) {
                if (listCountries.get(i).countryCode.equalsIgnoreCase(input)) {
                    System.out.println(err);
                    check = true;
                    break;
                }
            }
            if (check == false) {
                break;
            }
        }
        return input;
    }

    protected static String InputStringName(String message, String err, List<EastAsiaCountries> listCountries) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean check = true;
        // check duplicate
        while (true) {
            check = false;
            System.out.println(message);
            input = scanner.nextLine();
            for (int i = 0; i < listCountries.size(); i++) {
                if (listCountries.get(i).countryName.equalsIgnoreCase(input)) {
                    System.out.println(err);
                    check = true;
                    break;
                }
            }
            if (check == false) {
                break;
            }
        }
        return input;
    }

    protected static String InputString(String message) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean check = false;
        System.out.println(message);
        input = scanner.nextLine();
        return input;
    }

}
