package amazingRaceV2;
//import data.*;

import data.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        runToDead();
    }
    
//    public static void playANonuymous() {
//        List list = new ArrayList();
//    }

    public static void runToDead() {
        Racer mnn = new Racer() {
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
               return new Random().nextDouble() * MAX_SPEED * 3;
            }

            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n",
                "MNN-RACER", "MNN", runToDead());
            }
        };
        
        Dog d1 = new Dog("NGAO DA", 2021, 50.0);
        Pet d2 = new Dog("VANG", 1950, 10.0);
        Racer d3 = new Dog("NANH TRANG", 2901, 20.0);

        Motor m1 = new Motor("EXCITER", "150.0cm3", "12345");
        Racer m2 = new Motor("WINNER", "150.0cm3", "54321");

        Racer[] racer = {mnn, d1, (Dog) d2, d3, m1, m2};

        for (Racer x : racer) {
            x.showHowToDead();
        }
    }
}
