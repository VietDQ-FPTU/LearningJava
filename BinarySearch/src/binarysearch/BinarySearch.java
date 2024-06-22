/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("size: ");
        int size = Integer.parseInt(sc.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(size);
        }
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i -1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < array.length - 1; i++) {
            int indexMinx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexMinx] > array[j]) {
                    indexMinx = j;
                }
            }
            if (indexMinx != i) {
                int stem = array[i];
                array[i] = array[indexMinx];
                array[indexMinx] = stem;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("search: ");
        int search = sc.nextInt();

        int head = 0, tail = size - 1, middle, index = -1;
        while (head < tail) {
            middle = (head + tail) / 2;
            if (array[middle] == search) {
                index = middle;
                break;
            } else if (array[middle] < search) {
                head = middle + 1;
            } else {
                tail = middle - 1;
            }
        }
        System.out.println(index);
    }

}
