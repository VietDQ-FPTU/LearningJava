/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageexpense;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Thinkpad
 */
public class ManageExpense {

    static void AddExpense(File file) throws IOException {
        System.out.println("-------- Add an expense--------");
        String date = GetValue.getDate();
        double number = GetValue.number();
        String content = GetValue.content();
        Expense expense = new Expense(date, number, content);
        FileWriter wFile = new FileWriter(file, true);
        wFile.write(expense.toString());
        wFile.close();
    }

    static void DisplayAllExpenses(File file) {
        if (file.exists() == false) {
            return;
        }
        System.out.println("---------Display all expenses------------");
        System.out.printf("%-15s %-15s %-15s %-15s \n", "ID", "Date", "Amount", "Content");
        try {
            FileReader fRead = new FileReader(file);
            BufferedReader bfRead = new BufferedReader(fRead);
            String line = null;
            double sum = 0;
            while ((line = bfRead.readLine()) != null) {
                String[] array = line.split("\\*");
                sum += Double.parseDouble(array[2]);
                System.out.printf("%-15s %-15s %-15s %-15s\n", array[0], array[1], array[2], array[3]);
            }
            System.out.println("        Total: " + sum);
        } catch (Exception e) {
        }
    }

    static void RemoveExpense(File file) {

    }
}
