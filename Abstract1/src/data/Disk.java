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
public class Disk extends Shape{
    private String smile;
    private double radius;
    
    public static final double PI = 3.14;

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Disk.PI * radius * radius;
    }

    @Override
    public double getPeimeter() {
         return 2 * Math.PI * radius;
    }

    @Override
    public void paint() {
        System.out.printf("Disk  |%-10s|%-10s|%-10s|%-3s|%4.1f|%7.2f|\n", owner, color, borderColor, smile, radius, getArea());
    }
    
    
}
