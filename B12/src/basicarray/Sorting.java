/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarray;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class Sorting {

    public static void main(String[] args) {
//        System.out.println("Ahihihi");
//        sortPrimitivaArray();
//        sortPrimitivaArrayV2();
//        sortStudentList();
            inputStudentList();
    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        int count, yob;
        String id, name;
        double gpa;

        Student arr[];

        System.out.print("How many students do you want to input? ");
        count = Integer.parseInt(sc.nextLine());

        arr = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Input student " + (i + 1) + "/" + count + " : " );
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());

            arr[i] = new Student(id, name, yob, gpa);
        }
        
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public static void sortStudentList() {
        Student arr[] = new Student[]{
            new Student("HE4", "Viet", 12, 9),
            new Student("HE5", "binh", 15, 8),
            new Student("HE7", "nam", 16, 6),
            new Student("HE8", "an", 17, 7),};

        for (Student x : arr) {
            x.showProfile();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Sau sap xep hem");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
    }

    public static void sortPrimitivaArrayV2() {

        int arr[] = new int[]{-1000, 1000, 50, 30, -23, -5435};

        System.out.println("befor sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
//            System.out.println("");

        System.out.println("After sorting ascending");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void sortPrimitivaArray() {

        int arr[] = new int[]{-1000, 1000, 50, 30, -23, -5435};

        System.out.println("befor sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
        }
//            System.out.println("");

        System.out.println("After sorting ascending");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
