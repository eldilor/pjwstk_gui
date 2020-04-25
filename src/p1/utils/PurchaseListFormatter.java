package p1.utils;

import p1.Entity.Purchase;

import java.util.ArrayList;

public class PurchaseListFormatter {
    public static String format(ArrayList<Purchase> purchases) {
        String purchasesString = "";
        int total = 0;

        for (int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            purchasesString += "\t" + (i+1) + ". " + purchase + "\n";
            total += purchase.getProduct().getPrice() * purchase.getQuantity();
        }

        purchasesString += "--------------\nSuma: " + PriceFormatter.format(total);

        return purchasesString;
    }
}
