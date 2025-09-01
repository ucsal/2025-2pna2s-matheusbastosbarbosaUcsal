package br.com.mariojp.solid.srp;

public class ReceiptService {
    public String generate(Order order) {
        double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        
        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.calculate(subtotal);
        
        double total = subtotal + tax;
        
        ReceiptFormatter formatter = new ReceiptFormatter();
        return formatter.format(order.getItems(), subtotal, tax, total);
    }
}
