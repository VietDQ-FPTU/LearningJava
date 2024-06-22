/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
class Calculator {

    static void additionMatrix() {
        System.out.println("-------- Addition --------");
        int[][] matrix1 = getValue.inputValueMatrix1();
        int[][] matrix2 = getValue.inputValueMatrix2(matrix1);
        Display.resultAdditionMatrix(matrix1, matrix2);
    }

    static void subtractionMatrix() {
        System.out.println("-------- Subtraction --------");
        int[][] matrix1 = getValue.inputValueMatrix1();
        int[][] matrix2 = getValue.inputValueMatrix2(matrix1);
        Display.resultSubtractionMatrix(matrix1, matrix2);
    }

    static void multoplicationMatrix() {
        System.out.println("-------- Multoplication --------");
        int[][] matrix1 = getValue.inputValueMatrix1();
        int[][] matrix3 = getValue.inputValueMatrix3(matrix1);
        Display.resultMultiplication(matrix1, matrix3);
    }

}
