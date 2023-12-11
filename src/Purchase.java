public class Purchase implements Comparable<Purchase> {

    private String item;
    private double price;

    public Purchase(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "You bought: " + item + " - " + price;
    }

    @Override
    public int compareTo(Purchase anotherPurchase ) {
        return Double.compare(this.price, anotherPurchase.getPrice());
    }
}
