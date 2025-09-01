package br.com.mariojp.solid.srp;

public class TaxCalculator {
    public double calculate(double subtotal) {
        String taxRateProperty = System.getProperty("tax.rate");
        double taxRate = 0.10; // Default tax rate if property is not set

        if (taxRateProperty != null) {
            try {
                taxRate = Double.parseDouble(taxRateProperty);
            } catch (NumberFormatException e) {
                // Handle the case where the property is not a valid number
                System.err.println("Invalid tax.rate property value. Using default.");
            }
        }
        return subtotal * taxRate;
    }
}