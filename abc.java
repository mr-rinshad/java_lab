interface Bill {
    void calculate();
}

class Product implements Bill {
    int id1 = 101, qty1 = 2, price1 = 25;
    int id2 = 102, qty2 = 1, price2 = 100;

    String name1 = "A";
    String name2 = "B";

    public void calculate() {
        int total1 = qty1 * price1;
        int total2 = qty2 * price2;
        int netAmount = total1 + total2;

        System.out.println("\n\t\tBILL");
        System.out.println("Order No : 1001");
        System.out.println("Date : 06/04/2026");

        System.out.println("---------------------------------------------------");
        System.out.println("Product Id\tName\tQuantity\tUnit Price\tTotal");
        System.out.println("---------------------------------------------------");

        System.out.println(id1 + "\t\t" + name1 + "\t" + qty1 + "\t\t" + price1 + "\t\t" + total1);
        System.out.println(id2 + "\t\t" + name2 + "\t" + qty2 + "\t\t" + price2 + "\t\t" + total2);

        System.out.println("---------------------------------------------------");
        System.out.println("\t\t\t\tNet Amount : " + netAmount);
    }
}

public class BillMain {
    public static void main(String[] args) {
        Product p = new Product();
        p.calculate();
    }
}