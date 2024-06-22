/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf He = new Shelf("red", "HE Major");
        do {
            Menu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    He.addAStudent();
                    break;
                case 2:
                    He.ShowStudentList();
                    break;
                case 3:
                    He.seachStudent();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Choose only 1...6");
            }
        } while (choice != 6);
    }

    public static void Menu() {
        System.out.println("Welcome");
        System.out.println("Choose the following functions");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Upadate the student profile");
        System.out.println("5. Remove a student");
        System.out.println("6. Quit");
    }

    public static void CheckShelf() {

        Shelf tuHE = new Shelf("Red", "HE Major");
        Shelf tuSE = new Shelf("Blu", "SE Major");

        tuHE.addAStudent();
        tuHE.addAStudent();

        tuSE.addAStudent();
        tuHE.ShowStudentList();
        tuSE.ShowStudentList();
    }
}
