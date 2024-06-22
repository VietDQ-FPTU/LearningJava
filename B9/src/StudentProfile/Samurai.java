package StudentProfile;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        inputAprofile();
    }

    public static void inputAprofile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("loi roi ban oi");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile: ");

        System.out.println("Name: " + name);

        System.out.println("yob: " + yob);

        System.out.println("Address name: " + address);
    }
}
