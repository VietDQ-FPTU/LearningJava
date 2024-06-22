/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managemant_tstudent;

import static java.time.Clock.system;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
class Input {

    static int getOption() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Your Option: ");
                int option = Integer.parseInt(sc.nextLine());
                if (option > 0 && option < 6) {
                    return option;
                } else {
                    System.out.println("Your Option Need great than 0 and less than 6, try again!");
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat!, try again");
            }
        }
    }

    static String getStudentID(List<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("Eneter Student ID: ");
            id = sc.nextLine();
            if (checkDuplicat(id, listStudent) == true) {
                return id;
            }
        }
    }

    static String getStudentName() {
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("Eneter Student Name: ");
            name = sc.nextLine();
            if (name.matches("^[a-zA-Z ]+$") == true) {
                return name;
            } else {
                System.out.println("Your name if wrong fomat! try again");
            }
        }
    }

    static String getSemester() {
        Scanner sc = new Scanner(System.in);
        String semester;
        while (true) {
            System.out.print("Eneter Semester: ");
            semester = sc.nextLine();
            if (semester.matches("^[a-zA-Z0-9 ]+$") == true) {
                return semester;
            } else {
                System.out.println("Your Semester if wrong fomat! try again");
            }
        }
    }

    static String getCourseName() {
        Scanner sc = new Scanner(System.in);
        String courseName;
        while (true) {
            System.out.print("Eneter Course Name: ");
            courseName = sc.nextLine();
            if (courseName.equalsIgnoreCase("Java")) {
                return courseName = "Java";
            } else if (courseName.equalsIgnoreCase("Java")) {
                
            }
            else {
                System.out.println("Your name if wrong fomat! try again");
            }
        }
    }

    private static boolean checkDuplicat(String id, List<Student> listStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (id.toUpperCase().equals(listStudent.get(i).getId().toUpperCase())) {
                return false;
            }
        }
        return true;
    }

}
