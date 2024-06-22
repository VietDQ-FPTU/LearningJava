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
class getValue {

    static int enterOption() {
        Scanner sc = new Scanner(System.in);
        // use loop until user enter correct fomat option
        while (true) {
            // use try-catch to check fomat option
            try {
                System.out.print("Your choice: ");
                int option = Integer.parseInt(sc.nextLine());
                // use if to check option need great than 0 and less than 5
                if (option > 0 && option < 5) {
                    return option;
                } else {
                    System.out.println("Your option wrong need great than 0 and less than 5! Try again");
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat! Try again");
            }
        }
    }

    static int[][] inputValueMatrix1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Matrix 1:");
        int row = inputRowOrColumnMatrix("row");
        System.out.print("Enter Column Matrix 1:");
        int column = inputRowOrColumnMatrix("column");
        int[][] matrix1 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                while (true) {
                    System.out.print("Enter Matrix 1[" + (i + 1) + "][" + (j + 1) + "]:");
                    try {
                        matrix1[i][j] = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Value of matrix if digit");
                    }
                }

            }
        }
        return matrix1;
    }

    static int[][] inputValueMatrix2(int[][] matrix1) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        while (true) {
            System.out.print("Enter Row Matrix 2:");
            row = inputRowOrColumnMatrix("row");
            if (checkRowMatrix2(row, matrix1)) {
                break;
            } else {
                System.out.println("Row Matrix 2 Need Equal Matrix 1! Try Again");
            }
        }
        while (true) {
            System.out.print("Enter Column Matrix 2:");
            column = inputRowOrColumnMatrix("column");
            if (checkColumnMatrix2(column, matrix1)) {
                break;
            } else {
                System.out.println("Column Matrix 2 Need Equal Matrix 1! Try Again");
            }
        }
        int[][] matrix2 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                while (true) {
                    System.out.print("Enter Matrix 1[" + (i + 1) + "][" + (j + 1) + "]:");
                    try {
                        matrix2[i][j] = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Value of matrix if digit");
                    }
                }

            }
        }
        return matrix2;
    }

    private static int inputRowOrColumnMatrix(String mess) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine());
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Your " + mess + " need great than 0! Try again");
                }
            } catch (Exception e) {
                System.out.println("Your " + mess + " wrong fomat! Try again");
            }
        }
    }

    private static boolean checkRowMatrix2(int row, int[][] matrix1) {
        if (row == matrix1.length) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkColumnMatrix2(int column, int[][] matrix1) {
        if (column == matrix1[0].length) {
            return true;
        } else {
            return false;
        }
    }

    static int[][] inputValueMatrix3(int[][] matrix1) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        while (true) {
            System.out.print("Enter Row Matrix 2:");
            row = inputRowOrColumnMatrix("row");
            if (checkRowMatrix3(row, matrix1)) {
                break;
            } else {
                System.out.println("Row Matrix 2 Need Equal Matrix 1! Try Again");
            }
        }
        System.out.print("Enter Column Matrix 2:");
        column = inputRowOrColumnMatrix("column");
        int[][] matrix3 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                while (true) {
                    System.out.print("Enter Matrix 1[" + (i + 1) + "][" + (j + 1) + "]:");
                    try {
                        matrix3[i][j] = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Value of matrix if digit");
                    }
                }

            }
        }
        return matrix3;
    }

    private static boolean checkRowMatrix3(int row, int[][] matrix1) {
        if (row == matrix1[0].length) {
            return true;
        } else {
            return false;
        }
    }

}
