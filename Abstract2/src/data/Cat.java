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
public class Cat extends Pet {
    private String ribbon;
    public static final double Max_speed = 50;  
    
    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        Random mayNgauNhien = new Random();
        return mayNgauNhien.nextDouble() * Cat.Max_speed; // phát sinh con số không vượt quá 50
    }

    @Override
    public void showRecord() {
        
    }
    
    
    
    
    
    

    

    
    
}
