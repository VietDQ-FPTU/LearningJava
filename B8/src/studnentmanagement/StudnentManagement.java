package studnentmanagement;

import data.Student;
import java.util.Scanner;

public class StudnentManagement {
    public static void main(String[] args) {
        saveAStudent();
//        inputAStudent();
    }
    
    public static void saveAStudent() {
        Student viet = new Student("HE176173", "Dao Viet", 2003, 8.9);
        Student binh = new Student("HE122222", "Dao Binh", 2002, 9.9);
        viet.showProfile();
        binh.showProfile();
    }
    
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
}
