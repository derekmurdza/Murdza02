import java.util.*;

// This program calculates BMI using a given Unit Type
public class BMICalculator {
	
    public static void main(String[] args) {
    	
    // Initialize Scanner
        Scanner console = new Scanner(System.in);
        
    // Prompt User for the preferred Unit Type
        System.out.println("Select Unit Type: 1. Metric or 2. Imperial");
        
    // Store the selected choice
        int choice = console.nextInt();
        
        
        // Run this function if the user selects Metric Units
        if(choice == 1) {
        	
        // Prompt user for metric Height and Weight and store the input
            System.out.println("\nEnter Height in Centimeters: ");
            double cm = console.nextInt();   
            
        // Convert Centimeters to Meters
            double height = cm/100;
            
            System.out.println("\nEnter Weight in Kilograms: ");
            double weight = console.nextDouble();
            
        // Calculate the BMI using the Metric formula 
            double bmi = (weight / (height * height));
           
        // Print out calculated BMI
            if (bmi >= 0) {
            System.out.printf("\nBMI = %.1f\n",bmi);
            } else {
            	System.out.printf("\nInvalid Entry... Please Try Again");
            }
            
            // Determine the BMI category and print the result
            if(bmi >= 0) {
            	if (bmi < 18.5) {
            		System.out.println("\nCategory: Underweight");
                
            	} else if (bmi < 25) {
            		System.out.println("\nCategory: Normal");
                
            	} else if (bmi < 30) {
            		System.out.println("\nCategory: Overweight");
                
            	} else {
            		System.out.println("\nCategory: Obese");               
            }
        }
     }
            	
        // Run this function if user selects Imperial Units    
        if(choice == 2) {
        	
        // Prompt user for the imperial Height and Weight and store the input
        	System.out.println("\nEnter Height in Feet: ");
            double impFeet = console.nextInt();
        	
            System.out.println("\nEnter additional Height in Inches: ");
        	double impHeight = console.nextDouble();
        	
        // Convert Feet to Inches and add additional height if included
        	impHeight = impFeet*12 + impHeight;
        
        	System.out.println("\nEnter Weight in Pounds: ");     
        	double impWeight = console.nextDouble();
        	
        // Calculate the BMI using the Imperial formula
        	double impBmi = (impWeight * 703 / impHeight / impHeight);
        
        // Print out the calculated BMI
        	   if (impBmi >= 0) {
                   System.out.printf("\nBMI = %.1f\n",impBmi);
                   } else {
                   	System.out.printf("\nInvalid Entry... Please Try Again");
                   }
        
        	// Determine the BMI Category and print the result
        	  if(impBmi >= 0) {
        		if (impBmi < 18.5) {
        			System.out.println("\nCategory: Underweight");
            
        		} else if (impBmi < 25) {
        			System.out.println("\nCategory: Normal");
            
        		} else if (impBmi < 30) {
        			System.out.println("\nCategory: Overweight");
            
        		} else {
        			System.out.println("\nCategory: Obese");  
        		}
        	}
        }
    }
}
