import java.util.Collections;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println(("What's your credit card limit: "));
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);


        int exit = 1;
        while (exit != 0) {
            System.out.println("Please, type what you bought: ");
            String item = read.next();

            System.out.println("Now type the price of what you bought: ");
            double price = read.nextDouble();

            Purchase purchase = new Purchase(item, price);
            boolean purchased = card.Buying(purchase);

            if (purchased) {
                System.out.println("You bought it!");
                System.out.println("Type 0 to leave or 1 to continue.");
                exit = read.nextInt();
            }

            else {
                System.out.println("Sorry, you don't have enought limit to buy those items, please try again.");
                System.out.println("Type 0 to leave or 1 to continue.");
                exit = read.nextInt();
            }

            if(exit !=0 && exit != 1){

                System.out.println("It looks like you typed an option that does not exist, please try again.");
                System.out.println("Type 0 to leave or 1 to continue.");
                exit = read.nextInt();
            }

            System.out.println("****************");
            System.out.println("HERE IS YOUR EXTRACT:\n");

            for (Purchase p : card.getPurchased()) {
                Collections.sort(card.getPurchased());
                System.out.println(p.getItem() + " - " + p.getPrice());
            }

            System.out.println("\n****************");

            System.out.println("\n Credit card balance: " + card.getBalance());
        }
        read.close();
    }
}
