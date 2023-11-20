import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.addProducts(new Product("milk", 20));
        basket.addProducts(new Product("bread", 50));
        basket.addProducts(new Product("meat", 500));
        Card card = new Card("Gulumkan", "Uson kyzy", "1180000185904649", 5000, "password1234");
        Client client = new Client("Gulumkan", "Uson kyzy", 21, card, basket);
        System.out.println("Current balance: "+client.getCardBalnce());
        if (basket.summOfPrice() > 100) {
            boolean chek =true;
            while (chek) {
                System.out.println("Enter your  Password:");
                boolean isTrue = true;
                while (isTrue) {
                    if (card.getPassword().equals(new Scanner(System.in).nextLine())) {
                        if (basket.summOfPrice() <= client.getCardBalnce()) {
                            client.payWithCard(basket.summOfPrice());
                            isTrue = false;
                            chek = false;
                        } else {System.out.println("You don't have enough funds."); isTrue = false; chek = false;}
                    } else {System.out.println("Invalid password!");
                    isTrue = false;}
                }
            }
        }
        else client.payWithCard(basket.summOfPrice());
        System.out.println("Current balance: "+client.getCardBalnce());

    }
}