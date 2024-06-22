/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageexpense;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author Thinkpad
 */
class GetValue {

    static int EnterOption() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Your choice: ");
                int option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 4) {
                    return option;
                } else {
                    System.out.println("Your option need great than 0 and less than 5");
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat");
            }
        }
    }

    static String getDate() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Date: ");
                String sDate = sc.nextLine();
                if (sDate.matches("\\d{1,2}[/]\\d{1,2}[/]\\d{4}")) {
                } else {
                    System.out.println("Your date need same fomat " + "dd/MM/yyyy");
                    continue;
                }
                Date date = new Date();
                SimpleDateFormat spDate1 = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat spDate2 = new SimpleDateFormat("dd-MMM-yyyy");
                spDate1.setLenient(false);
                date = spDate1.parse(sDate);
                return sDate = spDate2.format(date);
            } catch (Exception e) {
                System.out.println("Your date not exits");
            }
        }
    }

    static double number() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Amount: ");
                double number = Double.parseDouble(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Your number wrong fomat");
            }
        }
    }

    static String content() {
        System.out.print("Enter Content:");
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        return content;
    }

}
