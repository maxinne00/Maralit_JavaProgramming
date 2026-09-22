public class Activity2 {
    public static void main(String[] args) {
        // data
        String customerName = "Maxinne Cute";
        double labubu = 299.50;
        double squishy = 1200.75;
        double needoh = 450.25;
     
        // formula
        double total = labubu + squishy + needoh;
        double vat = total * 0.12;
        double grandTotal = total + vat;
        int wholeTotal = (int) grandTotal;
      
        System.out.println("=========================================");
        System.out.println("            SHOPPING RECEIPT          ");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Customer : " + customerName);
        System.out.println();
        System.out.println("Items ");
        System.out.println("Labubu:              Php " +        labubu);
        System.out.println("Squishy:             Php " +      squishy);
        System.out.println("Needoh:              Php " +        needoh);
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Subtotal:            Php " + total);
        System.out.println("VAT:                 Php " + vat);
        System.out.println("Grand Total:         Php " + grandTotal);
        System.out.println("Whole Number Total:  Php " + wholeTotal);
        System.out.println();
        System.out.println("Free Shipping: " + (total > 1500));
        System.out.println();
        System.out.println("=========================================");
        System.out.println("        Thank you for shopping!        ");
        System.out.println("=========================================");

    }
}