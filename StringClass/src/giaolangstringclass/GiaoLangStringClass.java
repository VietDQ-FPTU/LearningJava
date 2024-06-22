/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaolangstringclass;

/**
 *
 * @author Thinkpad
 */
public class GiaoLangStringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void playWithString() {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        String s4 = "Hello";
        String s5 = "Hello";
        String s6 = "HELLO";
        
        //s1 không bằng s2 bới 2 vùng new khác nhau
        // s4 = s5 bản chất nó là 1 vùng new
        // s5 không bằng s6 bởi nó phân biệt in hoa và in thường (Integer thì không bởi nó là số)
    }
    
}
