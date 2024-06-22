/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0006;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class P0006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Step 1 Enter a number of array
        int sizeArray = GetValue.sizeOfArray();
        // Step 2 Enter a search number
        int searchNumber = GetValue.searchNumber();
        // Step 3 generate random integer in number range for each array element
        int[] array = GetValue.generateArray(sizeArray);
//        int[] array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        // Step 4 sort array
        GetValue.sortArray(array);
        // Step 5 Display the index of search number in array.
        displayIndexSearchNumber(array, searchNumber);
        // Check algorithm
        checkAlgorithm(array, searchNumber);
    }

    private static void displayIndexSearchNumber(int[] array, int searchNumber) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = array.length - 1;
        int index = -1;

        while (true) {
            int middle = (min + max) / 2;
            if (min > max) {
                System.out.println("Not Found");
                break;
            } else if (array[middle] == searchNumber) {
                index = middle;
                break;
            } else if (array[middle] > searchNumber) {
                max = middle - 1;
            } else if (array[middle] < searchNumber) {
                min = middle + 1;
            }
        }
        if (index != -1) {
            System.out.println("Found " + searchNumber + " at index: " + index);
        }
    }

    private static void checkAlgorithm(int[] array, int searchNumber) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = array.length - 1;
        System.out.println("");
        while (true) {
            int step = 1;
            int middle = (min + max) / 2;
            if (min > max) {
                System.out.print("Step " + step + " (searched value is absent): ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                break;
            } else if (array[middle] == searchNumber) {
                System.out.print("Step " + step + " (middle element is " + array[middle] + " == " + searchNumber + "):  ");
                for (int i = 0; i < array.length; i++) {
                    if (i == middle) {
                        System.out.print("[" + array[i] + "] ");
                    } else {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println("");
                int index = middle;
                break;
            } else if (array[middle] > searchNumber) {
                System.out.print("Step " + step + " (middle element is " + array[middle] + " > " + searchNumber + "):   ");
                for (int i = 0; i < array.length; i++) {
                    if (i == middle) {
                        System.out.print("[" + array[i] + "] ");
                    } else {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println("");
                max = middle - 1;
            } else if (array[middle] < searchNumber) {
                System.out.print("Step " + step + " (middle element is " + array[middle] + " < " + searchNumber + ")    :");
                for (int i = 0; i < array.length; i++) {
                    if (i == middle) {
                        System.out.print("[" + array[i] + "] ");
                    } else {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println("");
                min = middle + 1;
            }
            step++;
        }
    }

}
