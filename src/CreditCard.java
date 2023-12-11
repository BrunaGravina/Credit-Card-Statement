import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> purchased;


    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchased = new ArrayList<>();
    }

    public boolean Buying(Purchase purchase){
        if (this.balance > purchase.getPrice()){
            this.balance -= purchase.getPrice();
            this.purchased.add(purchase);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchased() {
        return purchased;
    }


}
