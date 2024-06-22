/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.*;

public class Main {

    public static void main(String[] args) {
//        sortShapes();
//        playWithAnonymousClass();
        sortShapesWihAnomymouts();
    }

    public static void sortShapesWihAnomymouts() {
        Shapes onTheGo = new Shapes("This-Tui", "Random", "Random") {
            @Override
            public double getArea() {
                return 50;
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void Pain() {
                System.out.printf("Take-Away|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        };

        Rectangle r1 = new Rectangle("Tia", "PINK", "MAGENTA", 5.0, 6.0);
        Shapes r2 = new Rectangle("Tia", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MA", "PINK", "MAGENTA", 8.0);
        Shapes s3 = new Square("MA", "PINK", "MAGENTA", 9.0);

        Disk d1 = new Disk("Be Na", "RAINBOW", "RAINBOW", 2.0);
        Shapes d2 = new Disk("Ghe Be Na", "RAINBOW", "RAINBOW", 1.0);

//        Shapes[] arr = new Shapes[7];       
//        arr[0] = r1;
//        arr[0].Pain();;
        Shapes[] arr = new Shapes[]{r1, r2, s1, s2, s3, d1, d2, onTheGo};

        System.out.println("The list of shapes");
        for (Shapes x : arr) {
            x.Pain();
        }

        for (int i = 0; i < 8 - 1; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shapes a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        System.out.println("The list of shapes sorting ");
        for (Shapes x: arr) {
            x.Pain();
        }
    }

    public static void playWithAnonymousClass() {
        Shapes vangLai = new Shapes("CHINH MINh", "RED", "PINK") {
            @Override
            public double getArea() {
                return 50;
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void Pain() {
                System.out.printf("Hinh nay vo dinh|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        };
        vangLai.Pain();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("Tia", "PINK", "MAGENTA", 5.0, 6.0);
        Shapes r2 = new Rectangle("Tia", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MA", "PINK", "MAGENTA", 8.0);
        Shapes s3 = new Square("MA", "PINK", "MAGENTA", 9.0);

        Disk d1 = new Disk("Be Na", "RAINBOW", "RAINBOW", 2.0);
        Shapes d2 = new Disk("Ghe Be Na", "RAINBOW", "RAINBOW", 1.0);

//        Shapes[] arr = new Shapes[7];       
//        arr[0] = r1;
//        arr[0].Pain();;
        Shapes[] arr = new Shapes[]{r1, r2, s1, s2, s3, d1, d2};

        System.out.println("The list of shapes");
        for (Shapes x : arr) {
            x.Pain();
        }

        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shapes a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        System.out.println("The list of shapes sorting ");
        for (Shapes x : arr) {
            x.Pain();
        }
    }
}
