package fpt;

import java.util.Scanner;

public class MyToys {

    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final double MAX_ELEMENTS = 500;
    
        public static int getAnInteger(String name) { 
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println(name);
                n = Integer.parseInt(sc.nextLine());
//                if (lower upper)
                return n;
            } catch (Exception e) {
                System.out.println("Nhap sai roi ban oi");
            }

        } while (true);

    }
        
    public static int getAnInteger() { 
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Nhap so nguyen: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Nhap sai roi ban oi");
            }

        } while (true);

    }
}
