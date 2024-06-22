package studentmanagement;

import data.*;
import java.util.*;

public class StudentManagementV2 {
    
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();
        se.printStudentList();
        se.updateAStudent();
        se.printStudentList();
        
//        se.searchAStudent();
//        se.searchAStudent();
    }
//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//        
//        System.out.println("INPUT SE");
//        se.addAStudent();
//        
//        System.out.println("INPUT IA");
//        ia.addAStudent();
//        ia.addAStudent();
//        
//        System.out.println("SE STUDENT");
//        se.printStudentList();
//        
//        System.out.println("IA STUDENT");
//        ia.printStudentList();
//    }


}
