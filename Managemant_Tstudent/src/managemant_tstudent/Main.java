/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managemant_tstudent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thinkpad
 */
public class Main {

    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        
        while (true) {
            Display.menu();
            int option = Input.getOption();
            switch (option) {
                case 1:
                    manager.creteStduent(listStudent);
                case 2:
                    manager.FindAndSort(listStudent);
                case 3:
                    manager.updateOrDelete(listStudent);
                case 4:
                    manager.report(listStudent);
                case 5: 
                    System.exit(0);
            }
        }
    }

}
