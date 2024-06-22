/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpad
 */
public class Square extends Rectangle {
//    private String owner;
//    private String color;
    private double edge;
    private double hight;
    
    public Square(String owner, String color, double edge, double hight) {
        super(owner, color, edge, edge);
        this.hight = hight;
    }
    
 

    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, width, this.hight, getArea());
    }

}
