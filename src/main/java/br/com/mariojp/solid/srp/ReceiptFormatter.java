package br.com.mariojp.solid.srp;

import java.util.List;

public class ReceiptFormatter {
    public String format(List<Item> items, double subtotal, double tax, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RECIBO ===\n");
        for (var i : items) {
            sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
                    .append("\n");
        }
        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("Tax: ").append(tax).append("\n");
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}