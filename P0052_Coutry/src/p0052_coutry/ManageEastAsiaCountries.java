/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0052_coutry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class ManageEastAsiaCountries {

    public static void main(String[] args) {
        List<EastAsiaCountries> listCountries = new ArrayList<EastAsiaCountries>();
        while (true) {
            // display menu
            menu();
            // enter option 
            int option = enterOption();
            // call funtion following option
            switch (option) {
                case 1:
                    enterCountry(listCountries);
                    break;
                case 2:
                    diplayInformationCoutry(listCountries);
                    break;
                case 3:
                    searchCoutry(listCountries);
                    break;
                case 4:
                    displayAllCountriesIncreasing(listCountries);
                    break;
                case 5:
                    System.exit(0);
            }
            System.out.println("");
        }
    }

    private static void menu() {
        System.out.println("1. Enter the information for 11 countries in Southeast Asia.");
        System.out.println("2. Display already information.");
        System.out.println("3. Search the country according to the entered country's name.");
        System.out.println("4. Display the information increasing with the country name.");
        System.out.println("5. Exit.");
    }

    private static int enterOption() {
        Scanner scanner = new Scanner(System.in);
        int option;
        // Use a loop until the user enters the correct format
        while (true) {
            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option >= 1 && option <= 5) {
                    break;
                } else {
                    System.out.println("Your option reater than or equal to 1 and less than or equal to 5, try again");
                }
            } catch (Exception e) {
                System.out.println("Your option wrong fomat, try again");
            }
        }
        return option;
    }

    private static void enterCountry(List<EastAsiaCountries> listCountries) {
        if (listCountries.size() == 11) {
            System.out.println("Enough for 11 countries");
            return;
        }
        String countryCode = enterString("code", listCountries);
        String countryName = enterString("name", listCountries);
        float totalArea = enterArea();
        String countryTerrain = enterString("terrain", listCountries);

        EastAsiaCountries coutry = new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain);
        listCountries.add(coutry);
    }

    private static void diplayInformationCoutry(List<EastAsiaCountries> listCountries) {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
        listCountries.get(listCountries.size() - 1).diplay();
    }

    private static void searchCoutry(List<EastAsiaCountries> listCountries) {
        if (listCountries.isEmpty()) {
            System.out.println("List countries is empty");
            return;
        }
        Scanner sc = new Scanner(System.in);
        String value;
        do {
            System.out.println("Enter the name you want to search for:");
            value = sc.nextLine();
            value = value.trim();
            if (value.isEmpty()) {
                System.out.println("Can't empty! Try again!");
            } else {
                break;
            }
        } while (true);
        for (int i = 0; i < listCountries.size(); i++) {
            if (listCountries.get(i).countryName.equalsIgnoreCase(value)) {
                System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
                listCountries.get(i).diplay();
                break;
            }
        }
    }

    private static void displayAllCountriesIncreasing(List<EastAsiaCountries> listCountries) {
        Collections.sort(listCountries, new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries coutry1, EastAsiaCountries coutry2) {
                if (coutry1.getCountryName().compareToIgnoreCase(coutry2.getCountryName()) < 0) {
                    return -1;
                } else if (coutry1.getCountryName().compareToIgnoreCase(coutry2.getCountryName()) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
        for (int i = 0; i < listCountries.size(); i++) {
            listCountries.get(i).diplay();
        }
    }

    private static String enterString(String mess, List<EastAsiaCountries> listCountries) {
        Scanner sc = new Scanner(System.in);
        String value;
        while (true) {
            do {
                System.out.println("Enter " + mess + " of country:");
                value = sc.nextLine();
                value = value.trim();
                if (value.isEmpty()) {
                    System.out.println("Can't empty! Try again!");
                } else {
                    break;
                }
            } while (true);
            // check duplicate
            while (true) {
                boolean check = false;
                for (int i = 0; i < listCountries.size(); i++) {
                    if (mess.equals("code")) {
                        if (listCountries.get(i).countryCode.equalsIgnoreCase(value)) {
                            check = true;
                        }
                    } else if (mess.equals("name")) {
                        if (listCountries.get(i).countryName.equalsIgnoreCase(value)) {
                            check = true;
                        }
                    }
                }
                if (check == true) {
                    System.out.println(mess + " Already on the list, Try again!");
                    break;
                } else {
                    return value;
                }
            }
        }
    }

    private static float enterArea() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter total Area:");
                float value = Float.parseFloat(sc.nextLine());
                if (value > 0) {
                    return value;
                }
            } catch (Exception e) {
                System.out.println("Wrong fomat!");
            }
        }
    }
}
