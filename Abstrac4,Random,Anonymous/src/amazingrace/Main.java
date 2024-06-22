/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.                                                    
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author Thinkpad
 */
public class Main {

    public static void main(String[] args) {
        showRecords();
    }

    public static void showRecordsWithAnonymous() {
        
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("UFO   |%-10s|%4d|%4.1f|%4.1f|\n", name, yob, weight, run());
            }
        };
                
        Hamster xx = new Hamster("Nhat", 2021, 0.3);

        Pet racer[] = new Pet[]{new Dog("ChiHuHuHu", 2021, 0.5),
            new Dog("Cau Vang", 1960, 9.0),
            new Cat("Tom", 1950, 10.0),
            new Cat("KItty", 1990, 5.0),
            new Hamster("JERRY", 1960, 0.5)
        };
        //  racer[0] = new Dog("", 0, 0);

        for (Pet x : racer) {
            x.showRecord();
        }

        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {

                }
            }
        }
    }

    public static void showRecords() {
        Hamster xx = new Hamster("Nhat", 2021, 0.3);

        Pet racer[] = new Pet[]{new Dog("ChiHuHuHu", 2021, 0.5),
            new Dog("Cau Vang", 1960, 9.0),
            new Cat("Tom", 1950, 10.0),
            new Cat("KItty", 1990, 5.0),
            new Hamster("JERRY", 1960, 0.5)
        };
        //  racer[0] = new Dog("", 0, 0);

        for (Pet x : racer) {
            x.showRecord();
        }

        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {

                }
            }
        }
    }
}
