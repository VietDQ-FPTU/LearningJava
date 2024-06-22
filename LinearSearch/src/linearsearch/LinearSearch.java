/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Step 1 Enter a number of array
        int sizeArray = inputSizeOfArray();
        // Step 2 Enter a search number
        int searchNumber = inputSearchNumber();
        // Step 3 generate random integer in number range for each array element
        int[] array = generateArray(sizeArray);
        // Step 4 Display the array
        displayArray(array);
        // Step 5 Display the index of search number in array.
        displayIndexSearchNumberInArray(array, searchNumber);
        // Check algorithm
        checkAlgorithm(array, searchNumber);
    }

    private static int inputSizeOfArray() {
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

    private static int inputSearchNumber() {
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

    private static int[] generateArray(int sizeArray) {
        Random random = new Random();
        int[] array = new int[sizeArray];
        // Generate random integer in number range input
        for (int i = 0; i < sizeArray; i++) {
            // Add generate random integer to the array
            array[i] = random.nextInt(sizeArray);
        }
        return array;
    }

    private static void displayArray(int[] array) {
        System.out.print("The array: [");
        // Display elelent array
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static void displayIndexSearchNumberInArray(int[] array, int searchNumber) {
        int quantityFound = 0;
        int[] saveIndex = new int[array.length];
        // Compare search number with each element in array
        for (int i = 0; i < array.length; i++) {
            if (searchNumber == array[i]) {
                saveIndex[quantityFound] = i;
                quantityFound++;
            }
        }
        // Found search number in array
        if (quantityFound > 1) {
            // Display index found with 1 index found
            System.out.print("Found " + searchNumber + " at index: ");
            for (int i = 0; i < quantityFound - 1; i++) {
                System.out.print(saveIndex[i] + ", ");
            }
            System.out.println(saveIndex[quantityFound - 1]);
        } else if (quantityFound == 1) {
            // Display index found great than 1 index found
            System.out.println("Found " + searchNumber + " at index: " + saveIndex[0]);
        } // not found search number in array
        else {
            System.out.println("Not found search number in array");
        }
    }

    private static void checkAlgorithm(int[] array, int searchNumber) {
        int quantityFound = 0;
        int[] saveIndex = new int[array.length];
        // Compare search number with each element in array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Compare array[" + i + "] = " + array[i] + " with " 
                    + searchNumber + ",");
            if (searchNumber == array[i]) {
                System.out.println(" equal");
                saveIndex[quantityFound] = i;
                quantityFound++;
            } else {
                System.out.println(" not equal");
            }
        }
        // Found search number in array
        if (quantityFound > 1) {
            // Display index found with 1 index found
            System.out.print("Found " + searchNumber + " at index: ");
            for (int i = 0; i < quantityFound - 1; i++) {
                System.out.print(saveIndex[i] + ", ");
            }
            System.out.println(saveIndex[quantityFound - 1]);
        } else if (quantityFound == 1) {
            // Display index found great than 1 index found
            System.out.print("Found " + searchNumber + " at index: " + saveIndex[0]);
        } // not found search number in array
        else {
            System.out.println("Not found search number in array");
        }
    }

}
