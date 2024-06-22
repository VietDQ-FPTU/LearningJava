/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managemant_tstudent;

import java.util.List;

/**
 *
 * @author Thinkpad
 */
class manager {

    static void creteStduent(List<Student> listStudent) {
        while (listStudent.size() <= 10) {
            String id;
            String studentName;
            String semester;
            String courseName;
            id = Input.getStudentID(listStudent);
            id = Input.getStudentName();
            id = Input.getSemester();
            id = Input.getCourseName();
        }
    }

    static void FindAndSort(List<Student> listStudent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void updateOrDelete(List<Student> listStudent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void report(List<Student> listStudent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
