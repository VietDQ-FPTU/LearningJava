package fpt.main;

import fpt.MyToys;

public class Stage {

    public static void main(String[] args) {
        System.out.println(MyToys.PI);
//        MyToys.PI = 4.0;
        System.out.println(MyToys.PI);

        int width = MyToys.getAnInteger("Moi nhap width: ");
        int length = MyToys.getAnInteger("Moi nhap length: ");

        System.out.println("width: " + width);
        System.out.println("length: " + length);
    }
}
