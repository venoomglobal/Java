package bmi;
import java.util.Scanner;
public class bmi_modified {
    
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
        
        System.out.printf("The BMI is %5.2f\n ",  bmi);
    
    if (bmi < 16) 
      System.out.println("You are seriously underweight.");
    
    else if (bmi < 18) 
      System.out.println("You are underweight.");
    
    else if (bmi < 24) 
      System.out.println("You are normal weight.");
    
    else if (bmi < 29) 
      System.out.println("You are overweight.");
      
     else if (bmi < 35) 
      System.out.println("You are seriously overweight.");  
    
     else 
      System.out.println("You are obese.");
    
    
    }
    
}
