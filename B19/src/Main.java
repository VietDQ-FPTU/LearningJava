/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpad
 */
public class Main {
    public static void main(String[] args) {
//        playWithTriangles();
        Rectangle a = new Square("hi", "hu", 5, 12);
        a.paint();
 
       
    }
    

    
    public static void playWithTriangles() {
        Triangle t1 = new Triangle("Tia", "Pink", 3, 4, 5);
        t1.paint();
        
        RightTriangle rt1 = new RightTriangle("Ma", "Pink", 6, 8);
        rt1.paint();
        
        Triangle rt2 = new RightTriangle("VIet", "raibow", 6, 8);
        rt2.paint();
    }
}
