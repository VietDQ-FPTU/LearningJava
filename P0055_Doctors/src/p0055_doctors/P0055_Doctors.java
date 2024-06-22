/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0055_doctors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class P0055_Doctors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Doctor> listDoctor = new ArrayList<>();
        while (true) {
            menu();
            int option = enterOption();
            if (option == 1) {
                addDoctor(listDoctor);
            } else if (option == 2) {
                uppdateDoctor(listDoctor);
            } else if (option == 3) {
                deleteDoctor(listDoctor);
            } else if (option == 4) {
                searchDoctor(listDoctor);
            } else {
                System.exit(0);
            }
        }
    }

    private static void menu() {
        System.out.println("========= Doctor Management ==========");
        System.out.println("1.	Add Doctor");
        System.out.println("2.	Update Doctor");
        System.out.println("3.	Delete Doctor");
        System.out.println("4.	Search Doctor");
        System.out.println("5.	Exit");
    }

    private static int enterOption() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Please choice one option: ");
                int option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 5) {
                    return option;
                } else {
                    System.out.println("Option need great than 0 and less than 4!");
                }
            } catch (Exception e) {
                System.out.println("Please enter is a number!");
            }
        }
    }

    private static void addDoctor(List<Doctor> listDoctor) {
        System.out.println("--------- Add Doctor ----------");
        String code;
        do {
            code = enterString("Code", listDoctor);
            if (checkDuplicate(code, listDoctor) != -1) {
                System.out.println("This code already exists");
            } else {
                break;
            }
        } while (true);
        String name = enterString("Name", listDoctor);
        String specialization = enterString("Specialization", listDoctor);
        int availability = enterAvailability();
        Doctor doctor = new Doctor(code, name, specialization, availability);
        listDoctor.add(doctor);
    }

    private static void uppdateDoctor(List<Doctor> listDoctor) {
        if (listDoctor.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("--------- Update Doctor -------");
        String code = enterString("Code", listDoctor);
        if (checkDuplicate(code, listDoctor) != -1) {
            int index = checkDuplicate(code, listDoctor);
            String name = enterString("Name", listDoctor);
            if (name.trim().isEmpty() == false) {
                listDoctor.get(index).setName(name);
            }
            String specialization = enterString("Specialization", listDoctor);
            if (specialization.trim().isEmpty() == false) {
                listDoctor.get(index).setSpecialization(specialization);
            }
            int availability = enterAvailability();
            listDoctor.get(index).setAvailability(availability);
        } else {
            System.out.println("Code not't exists in list");
        }
    }

    private static void deleteDoctor(List<Doctor> listDoctor) {
        if (listDoctor.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("--------- Delete Doctor -------");
        String code = enterString("Code", listDoctor);
        if (checkDuplicate(code, listDoctor) != -1) {
            int index = checkDuplicate(code, listDoctor);
            listDoctor.remove(index);
        } else {
            System.out.println("Code not't exists in list");
        }
    }

    private static void searchDoctor(List<Doctor> listDoctor) {
        if (listDoctor.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("--------- Search Doctor -------");
        String name = enterString("text", listDoctor);
        boolean check = false;
        for (int i = 0; i < listDoctor.size(); i++) {
            if (listDoctor.get(i).getName().contains(name)) {
                check = true;
                listDoctor.get(i).Info(i);
            }
        }
        if (check == false) {
            System.out.println("Not found");
        }
    }

    private static String enterString(String mess, List<Doctor> listDoctor) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter " + mess + ": ");
            String value = sc.nextLine();
            if (mess == "Code") {
                if (value.trim().isEmpty()) {
                    System.out.println("Code can't empty!");
                } else {
                    return value;
                }
            } else {
                return value;
            }
        }
    }

    private static int enterAvailability() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Availability: ");
                int availability = Integer.parseInt(sc.nextLine());
                return availability;
            } catch (Exception e) {
                System.out.println("Please enter is a interger number!");
            }
        }
    }

    private static int checkDuplicate(String code, List<Doctor> listDoctor) {
        int check = -1;
        for (int i = 0; i < listDoctor.size(); i++) {
            if (code.equalsIgnoreCase(listDoctor.get(i).getCode())) {
                check = i;
                break;
            }
        }
        return check;
    }

}
