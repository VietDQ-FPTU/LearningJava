/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Thinkpad
 */
class Display {

    static void menu() {
        System.out.println("=======Calculator program=======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multoplication Matrix");
        System.out.println("4. Quit");
    }

    static void resultAdditionMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("-------- Result --------");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("+");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("=");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + (matrix1[i][j] + matrix2[i][j]) + "]");
            }
            System.out.println("");
        }
    }

    static void resultSubtractionMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("-------- Result --------");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("-");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("=");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + (matrix1[i][j] - matrix2[i][j]) + "]");
            }
            System.out.println("");
        }
    }

    static void resultMultiplication(int[][] matrix1, int[][] matrix3) {
        int[][] matrixResult = new int[matrix1.length][matrix3[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("*");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print("[" + matrix3[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("=");
        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult[0].length; j++) {  
                for (int k = 0; k < matrix3.length; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix3[k][i];
                }
            }
        }
        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult[0].length; j++) {
                System.out.print("[" + matrixResult[i][j] + "]");
            }
            System.out.println("");
        }
    }
    

}
