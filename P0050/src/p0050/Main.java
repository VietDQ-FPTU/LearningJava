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
public class Main {

    public static void main(String[] args) {
        // loop until user want quit
        while (true) {
            // display menu
            Display.menu();
            // enter option
            int option = GetValue.enterOption();
            // call funtion according option
            switch (option) {
                case 1:
                    Calculate.superlativeEquation();
                    break;
                case 2:
                    Calculate.quadraticEquation();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
