/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

/**
 *
 * @author Thinkpad
 */
public class EastAsiaCountries extends Country{
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
        System.out.printf("%-15s %-15s %-15.1f %-15s\n", countryCode, countryName, totalArea, countryTerrain);
    }

    
    
    
}
