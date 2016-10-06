/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computeloanusinginputdialog;
// Import Dialog Box
import javax.swing.JOptionPane;
public class ComputeLoanUsingInputDialog {

    public static void main(String[] args) {
        // Create Dialog Box for entering yearly interest rate
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate, for example 8.25: ");
        
        // Convert string to double by using Double.parseDouble
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        
        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate/1200;
        
        //Enter number of years
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as an integer, \nfor example 5: ");
        
        // Convert string to integer by using the parseInt
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        
        //enter loan amount
        String loanString= JOptionPane.showInputDialog("Enter loan amount, for example 120000.95: ");
        
        // Convert string to double using parseDouble
        double loanAmount = Double.parseDouble(loanString);
        
        //Calculate payments
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        // Format to keep two digits after the decimal point
        monthlyPayment = (int)(monthlyPayment * 100)/ 100.0;
        totalPayment = (int)(totalPayment * 100)/ 100.0;
        
        //Display results
        String output = "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
        JOptionPane.showMessageDialog(null, output);
    }
    
}
