/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Thinkpad
 */
public class ManageEastAsiaCountries {

    public static void main(String[] args) {
        List<EastAsiaCountries> listCountries = new ArrayList<EastAsiaCountries>();
        while (true) {
            // Step 1: Display menu
            displayMenu();
            // Step 2: Selects option
            int select = selectsOption();
            // Step 3: Execute option
            executeOption(select, listCountries);
        }
    }

    private static void displayMenu() {
        System.out.println("                               MENU");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit ");
        System.out.println("==========================================================================");
    }

    private static int selectsOption() {
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

    private static void executeOption(int select, List<EastAsiaCountries> listCountries) {
        switch (select) {
            case 1:
                // Input the information 
                inputTheInformationCountry(listCountries);
                break;
            case 2:
                //Display information of countries you’ve just input
                displayInformationCountriesJustInput(listCountries);
                break;
            case 3:
                // Search the country according to the entered country's name
                searchTheCountry(listCountries);
                break;
            case 4:
                // Display the information increasing with the country name
                DisplayInformationIncreasing(listCountries);
                break;
            case 5:
                // stop
                System.exit(0);
        }
    }

    private static void inputTheInformationCountry(List<EastAsiaCountries> listCountries) {
        Scanner scanner = new Scanner(System.in);
        String countryCode = Input.InputCoutryCode("Enter code of country:", "Your country code is already in the list, try again", listCountries);
        String countryName = Input.InputStringName("Enter name of country:", "Your country name is already in the list, try again", listCountries);
        float totalArea = Input.InputNumber("Enter total Area:");
        String countryTerrain = Input.InputString("Enter terrain of country:");
        //Create object
        EastAsiaCountries addCountry = new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain);
        // add element in list
        listCountries.add(addCountry);
    }

    private static void displayInformationCountriesJustInput(List<EastAsiaCountries> listCountries) {
        // display information element just input
        listCountries.get(listCountries.size() - 1).display();

    }

    private static void searchTheCountry(List<EastAsiaCountries> listCountries) {
        Scanner scanner = new Scanner(System.in);
        String searchNameCoutry;
        boolean check = false;
        System.out.println("Enter the name you want to search for: ");
        searchNameCoutry = scanner.nextLine();
        // traversal list
        for (int i = 0; i < listCountries.size(); i++) {
            // Compare search name with name each element in list
            if (listCountries.get(i).countryName.toUpperCase().contains(searchNameCoutry.toUpperCase())) {
                listCountries.get(i).display();
                check = true;
            }
        }
        // not found
        if (check = false)
            System.out.println("Not found your country name in list");
    }

    private static void DisplayInformationIncreasing(List<EastAsiaCountries> listCountries) {
        List<EastAsiaCountries> listCountries2 = new ArrayList<>(listCountries);
        // Sort countries by name
        sortcoutries(listCountries2);
        for (int i = 0; i < listCountries2.size(); i++) {
            listCountries2.get(i).display();
        }
    }

    private static void sortcoutries(List<EastAsiaCountries> listCountries) {
        for (int i = 0; i < listCountries.size() - 1; i++) {
            for (int j = i + 1; j < listCountries.size(); j++) {
                if (listCountries.get(i).getCountryName().compareToIgnoreCase(listCountries.get(j).getCountryCode()) > 0 ) {
                    EastAsiaCountries temp;
                    temp = listCountries.get(i);
                    listCountries.set(i, listCountries.get(j));
                    listCountries.set(j, temp);
                }
            }
        }
    }
}
