/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageexpense;

/**
 *
 * @author Thinkpad
 */
public class Expense {
    static int ID;
    String date;
    double number;
    String content;

    public Expense() {
    }

    public Expense(String date, double number, String content) {
        this.ID++;
        this.date = date;
        this.number = number;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return ID + "*" + date + "*" + number + "*" + content + "\n";
    }
    
    
}
