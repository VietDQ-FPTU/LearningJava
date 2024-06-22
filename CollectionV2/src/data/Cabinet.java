/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class Cabinet {
    private List<Student> arr = new ArrayList();
       
    private Scanner sc = new Scanner(System.in);

    public Cabinet() {
    }
    
    public void addAStudent() {
   
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile " + (arr.size() + 1));
//        System.out.print("Input Id: ");
//        id = sc.nextLine().trim().toUpperCase();

        while(true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();
            Student xxx = searchAStudent(id);
            if (xxx == null) {
                break;
            }
            else
                System.out.println("Duplicated ID. Try another one!!!");
        }
        
        
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add a new Student successfully");
    }
    
    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty !!!");
            return;
        }
        
        System.out.println("There is/are " + arr.size() + "student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public Student searchAStudent(String id) {
        if (arr.isEmpty()) 
            return null;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }
        return null;
    }
    
    
    public void searchAStudent() {
        String keyword;
        System.out.println("Input the student id that you want to search: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if (xxx == null)
            System.out.println("STUDENT NOT FOUND");
        else {
            System.out.println("STUDNET FOUND! IS:");
            xxx.showProfile();
        }
    }
    
    public void updateAStudent() {
        String keyword;
        double newGPA;
        System.out.println("Input the student id that you want to update: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if (xxx == null)
            System.out.println("STUDENT NOT FOUND TO UPDATE");
        else {
            System.out.println("STUDNET FOUND! IS before updating:");
            xxx.showProfile();
            
            System.out.print("Input new GPA:");
            newGPA = Double.parseDouble(sc.nextLine());
            xxx.setGpa(newGPA);
            
            System.out.println("STUDNET FOUND! IS after updating:");
            xxx.showProfile();
        }
    }
    
    public void updateAStudent(Student x, double gpa) {
        x.setGpa(gpa);
    }
    
    public void updateAStudnet(String id, double gpa) {
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND!!! Nothing to update");
        }
    }
    
}
