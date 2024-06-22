import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    private static int lastExpenseId = 0;
    private int id;
    private String date;
    private double amount;
    private String content;

    public Expense(String date, double amount, String content) {
        this.id = ++lastExpenseId;
        this.date = date;
        this.amount = amount;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getContent() {
        return content;
    }
}

class HandyExpense {
    private ArrayList<Expense> expenses;

    public HandyExpense() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(String date, double amount, String content) {
        Expense expense = new Expense(date, amount, content);
        expenses.add(expense);
        System.out.println("Expense added successfully. Expense ID: " + expense.getId());
    }

    public void displayAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
        } else {
            System.out.println("List of all expenses:");
            for (Expense expense : expenses) {
                System.out.println("ID: " + expense.getId() + ", Date: " + expense.getDate() +
                        ", Amount: " + expense.getAmount() + ", Content: " + expense.getContent());
            }
        }
    }

    public void removeExpense(int id) {
        Expense expenseToRemove = null;
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expenseToRemove = expense;
                break;
            }
        }

        if (expenseToRemove != null) {
            expenses.remove(expenseToRemove);
            System.out.println("Expense removed successfully.");
        } else {
            System.out.println("Delete an expense fail. Expense with ID " + id + " not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HandyExpense handyExpense = new HandyExpense();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHandy Expense Menu:");
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Remove an expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (String): ");
                    String date = scanner.next();
                    System.out.print("Enter amount (double): ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter content (String): ");
                    String content = scanner.next();
                    handyExpense.addExpense(date, amount, content);
                    break;

                case 2:
                    handyExpense.displayAllExpenses();
                    break;

                case 3:
                    System.out.print("Enter the expense ID to remove: ");
                    int idToRemove = scanner.nextInt();
                    handyExpense.removeExpense(idToRemove);
                    break;

                case 4:
                    System.out.println("Exiting Handy Expense program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}