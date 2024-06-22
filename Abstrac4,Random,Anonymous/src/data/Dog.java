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
public class Dog extends Pet {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        Random mayNgauNhien = new Random();
        return mayNgauNhien.nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("DOG    |%-10s|%4d|%4.1f|%4.1f|\n", name, yob, weight, run());
    }
    
    
}
