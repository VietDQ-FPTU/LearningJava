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
public class Rectangle extends Shapes{
    protected double a, b;

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    

    @Override
    public double getArea() {
      return a * b;
    }

    @Override
    public double getPerimeter() {
        return a + b + a + b;
    }

    @Override
    public void Pain() {
        System.out.printf("RECTANGLE  |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f\n",owner, color, borderColor, a, b, getArea());
    }
    
    
}
