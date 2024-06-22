package main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        Student viet = new Student("HE176173", "Dao Viet", 2003, 8.9);
        viet.showProfile();

        viet = new Student("HE696969", "Okila", 1234, 2.4);
        viet.showProfile();
    }
}
