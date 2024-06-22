/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaolangwrapperclass;

/**
 *
 * @author Thinkpad
 */
public class GiaoLangWrapperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        playWIthIntegers();
        playWithPointes();
    }
    
    public static void playWithPool() {
        Integer n1 = 2003;
        Integer n2 = 2003;
        Integer n3 = new Integer(2003);
        Integer n4 = new Integer(2003);
        
        Integer n5 = 100;
        Integer n6 = 100; // lấy từ n5
        Integer n7 = new Integer(100);
        
        // n1 không bằng n2
        // n5 bằng n6
        // Nếu ta new ngầm thì trong đoạn [-128 ... 127] thì bằng nhau khi trung trong vùng nay
        // không bằng nhau nếu nằm ngoài vùng này
        // new là tạo một vùng ram mới
        
        
        
    }

    public static void playWithPointes() {
        Integer n1 = 128;
        Integer n2 = 128;

        if (n1 == n2) {
            System.out.println("Chung bang nhau");
        } else {
            System.out.println("Chung khong bang nhau"); // không so sanh 2 biến object
        }
        
        System.out.println("n1 vs n2 (core values): " + n1.equals(n2));
        System.out.println("n1 vs n2 (core values): " + n1.compareTo(n2));
    }

    public static void playWIthIntegers() {
        int num0 = 2003;
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer("2003");
        Integer num3 = 2003;
        Integer num4 = num0;

        System.out.println("num0: " + num0);    // Xài ngay luôn trong vùng ram
        System.out.println("num1: " + num1);    // Biến con trỏ mà, con trỏ vùng new
        System.out.println("num2: " + num2.toString());
        System.out.println("num3: " + num3.intValue());

        // Đóng mở hộp quà
        System.out.println("num4: " + num4);
        int num5 = num4;

        System.out.println("num5: " + num5);

        num4 = 2001;
    }

}
