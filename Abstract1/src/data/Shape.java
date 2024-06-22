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
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor; // màu đường bo cong
    //protected double a, b, c, d, e, f, radius; // Không nên để lớp cha vì lớp con sẽ nhận hêt tất cả
                                                 // các cạnh, mà mỗi hình có số cạnh khác nhau
                                                 // vậy nên nên để các cạnh ở lớp con

    public Shape() {
    }

    
    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    // Diện tích và chu vi không nên để ở lớp cha vì mỗi hình ( là lớp con ) có một cách tính riêng
    // Nhưng chúng ta vẫn nên để ở lớp cha, rồi thay đổi ở các lớp con
    
    public abstract double getArea();
    public abstract double getPeimeter();
    public abstract void paint();
        
    
}
