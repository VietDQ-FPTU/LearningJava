/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg65.averagemark;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class AverageMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        int option = 0;
        while (option != 3) {
            String name = entername("name: ");
            String classS = entername("class: ");
            double math = entermark("math: ");
            double cmistry = entermark("chemistry: ");
            double physic = entermark("physic: ");
            Student a = new Student(math, physic, cmistry, name, classS);
            list.add(a);
            option = enterO();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("info studen" + (i + 1));
            list.get(i).info();
        }
        
        int typea = 0, typeb = 0, typec = 0, typed = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).type == 'A') {
                typea++;
            } else if (list.get(i).type == 'B') {
                typeb++;
            }  else if (list.get(i).type == 'C') {
                typec++;
            }  else if (list.get(i).type == 'D') {
                typed++;
            } 
        }
        HashMap<String, Double> studentMap = new HashMap<>();
        studentMap.put("A", ((double) typea * 100 / list.size()));
        studentMap.put("B", ((double) typeb * 100 / list.size()));
        studentMap.put("C", ((double) typec * 100 / list.size()));
        studentMap.put("D", ((double) typed * 100 / list.size()));
        System.out.println(studentMap.entrySet());
        
        for (Map.Entry<String, Double> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }

//        System.out.println("A: " + ((double) typea * 100 / list.size()));
//        System.out.println("B: " + ((double) typeb * 100 / list.size()));
//        System.out.println("C: " + ((double) typec * 100 / list.size()));
//        System.out.println("D: " + ((double) typed * 100 / list.size()));
    }

    private static String entername(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter" + mess);
        return sc.nextLine();
    }

    private static double entermark(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter" + mess);
        return sc.nextDouble();
    }

    private static int enterO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter option: ");
        return sc.nextInt();
    }

}
