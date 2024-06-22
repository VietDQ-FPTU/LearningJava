/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.math.BigInteger;

/**
 *
 * @author Thinkpad
 */
public class Main {

    public static void main(String[] args) {
        // use loop until user want quit
        while (true) {
            Display.menu();
            int option = getValue.enterOption();
            // use switch-case to call funtion according user option
            switch (option) {
                case 1:
                    Calculator.additionMatrix();
                    break;
                case 2:
                    Calculator.subtractionMatrix();
                    break;
                case 3:
                    Calculator.multoplicationMatrix();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
