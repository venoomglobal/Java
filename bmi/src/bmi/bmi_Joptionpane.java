package bmi;

import javax.swing.JOptionPane;

public class bmi_Joptionpane {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "This program will calculate the BMI");

        //Declaring variables
        double weight, height, bmi;

        String input = JOptionPane.showInputDialog(null, "Enter your weight in pounds");

        weight = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Enter your height in inches");

        height = Double.parseDouble(input);

        bmi = (weight * 703) / (height * height);

        if (bmi < 16) {

            JOptionPane.showMessageDialog(null, "Height: " + height
                    + "\n Weight: " + weight
                    + "\n BMI: " + bmi
                    + "\n Classification: Invalid");

        } else if (bmi < 18) {

            JOptionPane.showMessageDialog(null, "Height: " + height
                    + "\n Weight: " + weight
                    + "\n BMI: " + bmi
                    + "\n Classification: Underweight");

        } else if (bmi < 24) {

            JOptionPane.showMessageDialog(null, "Height: " + height
                    + "\n Weight: " + weight
                    + "\n BMI: " + bmi
                    + "\n Classification: Normal Weight ");
            
        } else if (bmi < 29) {

            JOptionPane.showMessageDialog(null, "Height: " + height
                    + "\n Weight: " + weight
                    + "\n BMI: " + bmi
                    + "\n Classification: OverWeight ");
        }  else if (bmi < 35) {

            JOptionPane.showMessageDialog(null, "Height: " + height
                    + "\n Weight: " + weight
                    + "\n BMI: " + bmi
                    + "\n Classification:Seriously OverWeight ");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Height: " + height
                + "\n Weight: " + weight
                + "\n BMI: " + bmi
                + "\n Classification: Impossible !");
    }

}
}
