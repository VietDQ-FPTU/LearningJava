/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author Thinkpad
 */
public class People {

    double height, weight;

    public People() {
    }

    public People(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double bmi1(){
        double bmi = (weight * 10000) / (height * height);
        return bmi;
    }

    public void bmi() {
        double bmi = (weight * 10000) / (height * height);
        System.out.printf("BMI Number: %.2f\n", bmi);
        if (bmi < 19) {
            System.out.println("BMI Status: Under-standard");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("BMI Status: Standard");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("BMI Status: Overweight");
        } else if (bmi >= 30 && bmi <= 40) {
            System.out.println("BMI Status: Fat - should lose weight");
        } else {
            System.out.println("BMI Status: Very fat ");
        }
    }
}
