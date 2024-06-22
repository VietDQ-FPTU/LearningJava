/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0008_countchar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Thinkpad
 */
public class P0008_CountChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // enter string
        String value = enterString();
        // count word
        countWord(value);
        // count char
        countChar(value);
    }

    private static String enterString() {
        Scanner sc = new Scanner(System.in);
        String value;
        do {
            System.out.println("Enter your content:");
            value = sc.nextLine();
        } while (value.isEmpty());
        return value;
    }

    private static void countWord(String value) {
        HashMap<String, Integer> listWord = new HashMap<>();
        StringTokenizer st = new StringTokenizer(value);
        while (st.hasMoreElements()) {
            String token = st.nextToken();
            if (listWord.containsKey(token)) {
                int count = listWord.get(token) + 1;
                listWord.replace(token, count);
            } else {
                listWord.put(token, 1);
            }
        }
        int count = 0;

        if (listWord.isEmpty() == false) {
            System.out.print("{");
            for (Map.Entry<String, Integer> entry : listWord.entrySet()) {
                if (count < listWord.size() - 1) {
                    System.out.print(entry + ", ");
                } else {
                    System.out.println(entry + "}");
                }
                count++;
            }
        }
    }

    private static void countChar(String value) {
        HashMap<Character, Integer> listChar = new HashMap<>();
        StringTokenizer st = new StringTokenizer(value);
        String value1 = "";
        while (st.hasMoreElements()) {
            value1 += st.nextToken();
        }
        System.out.println(value1);
        StringTokenizer st1 = new StringTokenizer(value1, "");
        for (int i = 0; i < value1.length(); i++) {
            if (listChar.containsKey(value1.charAt(i))) {
                int count = listChar.get(value1.charAt(i)) + 1;
                listChar.replace(value1.charAt(i), count);
            } else {
                listChar.put(value1.charAt(i), 1);
            }
        }
        int count = 0;
        if (listChar.isEmpty() == false) {
            System.out.print("{");
            for (Map.Entry<Character, Integer> entry : listChar.entrySet()) {
                if (count < listChar.size() - 1) {
                    System.out.print(entry + ", ");
                } else {
                    System.out.println(entry + "}");
                }
                count++;
            }
        }
    }

}
