/*
Date: March 23, 2023
Author: Mahesh Bhattarai
Program : BMI
 */
import java.util.*;
public class Bmi {

    public static void main(String[] args) {
  
        
        //Declaring variables
        double weight, height, bmi; 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program will calculate the BMI");
        System.out.print("Enter the weight in pounds: ");
        weight = scan.nextDouble();
        
        System.out.print("Enter the height in inches: ");
        height = scan.nextDouble();
        
        bmi = (weight * 703.06) / (height * height);
        
        System.out.print("The BMI is: " + bmi + "\n");
        
        
        
    }
    
}
