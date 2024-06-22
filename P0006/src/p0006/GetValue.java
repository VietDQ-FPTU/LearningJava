/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0006;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
class GetValue {

    static int sizeOfArray() {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Enter number of array:");
        // Check fomat input
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                //Check input
                if (input <= 0) {
                    System.out.println("Your input need great than 0, try again!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Your input wrong fomat, try again!");
            }
        }
    }

    static int searchNumber() {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Enter search number :");
        // Check fomat input
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                //Check domain input
                if (input < 0) {
                    System.out.println("Your input need great than or equal to 0, try again!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Your input wrong fomat, try again!");
            }
        }
    }

    static int[] generateArray(int sizeArray) {
        Random random = new Random();
        int[] array = new int[sizeArray];
        // Generate random integer in number range input
        for (int i = 0; i < sizeArray; i++) {
            // Add generate random integer to the array
            array[i] = random.nextInt(sizeArray);
        }
        return array;
    }

    static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: {");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] +"]");
    }

}
