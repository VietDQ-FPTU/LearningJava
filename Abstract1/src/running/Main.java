/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running;

import com.sun.prism.ps.Shader;
import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author Thinkpad
 */
public class Main {

    public static void main(String[] args) {
//        playWithShape();
        sortShape();
    }

    public static void sortShape() {
        Rectangle r1 = new Rectangle("Viet", "Pink", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("Binh", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MAGENTA", 7);
        Rectangle s2 = new Square("MA", "PINK", "MAGENTA", 8);
        Shape s3 = new Square("MA", "PINK", "MAGENTA", 9);

        Disk d1 = new Disk("NGan", "Red", "MAGENTA", "<3", 6.0);
        Shape d2 = new Disk("Ngo", "Hong", "MAGENTA", ":>", 7.0);

        Triangle t1 = new Triangle("Ong", " RAINBOW", "BoRDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("Ong", " RAINBOW", "BoRDEAUX", 6, 8, 10);

        r1.paint();
        r2.paint();
        s1.paint();
        s2.paint();
        s3.paint();
        d1.paint();
        d2.paint();
        t1.paint();
        t2.paint();
        
        //        Shape[] box = new Shape[9];
        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shpes");
        for (Shape x : box) {
            x.paint();
        }
    }

    public static void playWithShape() {
        Rectangle r1 = new Rectangle("Viet", "Pink", "MAGENTA", 5.0, 6.0);

        Shape r2 = new Rectangle("Binh", "MAGENTA", "PINK", 6.0, 5.0);

        Disk d1 = new Disk("NGan", "Red", "MAGENTA", "<3", 6.0);
        Shape d2 = new Disk("Ngo", "Hong", "MAGENTA", ":>", 7.0);

        r1.paint();
        r2.paint();
        d1.paint();
        d2.paint();
        

     }
}
