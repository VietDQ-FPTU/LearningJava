/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageexpense;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Thinkpad
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        // use loop until user want exit
        while (true) {
            // display menu
            Display.memu();
            // enter option;
            int option = GetValue.EnterOption();
            // call funtion accoding option
            switch(option) {
                case 1:
                    ManageExpense.AddExpense(file);
                    break;
                case 2: 
                    ManageExpense.DisplayAllExpenses(file);
                    break;
                case 3:
                    ManageExpense.RemoveExpense(file);
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
}
