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
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    @Override
    public void Pain() {
        System.out.printf("SQUARE |%-10s|%-10s|%-10s|%4.1f|%7.2f\n",owner, color, borderColor, a, getArea());

    }
    
}
