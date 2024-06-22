/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Thinkpad
 */
public abstract class Pet {
    protected String name;
    protected double yob;
    protected double weight;

    public Pet(String name, double yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYob() {
        return yob;
    }

    public void setYob(double yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public abstract double run();
    public abstract void showRecord();
    
}
