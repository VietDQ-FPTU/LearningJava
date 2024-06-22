/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author Thinkpad
 */
public class Dog extends Pet implements Racer{
    
    public static final double MAX_SPEED = 40;

    public Dog(String name, double yob, double weight) {
        super(name, yob, weight);
    }
    

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG", name, yob, weight, run());   
    }

    @Override
    public double runToDead() {
        return run() * 5;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%-11s|%5.1f|\n",
                "DOG-RACER", name, yob, weight, runToDead());
    }
    
}
