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
public class Shelf {

    private Scanner sc = new Scanner(System.in);
    // đặt điểm
    private String color;
    private String label;

    // đặc điểm đặc biệt
    private Student arr[] = new Student[500];
    private int count = 0;

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void addAStudent() {
        String id, name;
        double gpa;
        int yob;
        
        System.out.println("Input student " + (count + 1) + "/" + arr.length + " : ");
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr[count] = new Student(id, name, yob, gpa);
        count++;
        
        System.out.println("Them ho so thanh cong");
    }
    
    public void ShowStudentList() {
        System.out.println("there is/are " + count + "student(s) in the list");
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }
    
    public void seachStudent() {
        String id;
        System.out.println("Input id you want to search");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student found !!!");
                arr[i].showProfile();
               
                return;
            }
        }
        System.out.println("Not found !!!");
    }
}
