import java.util.Scanner;

public class Client implements CardInterface {
    private String firstName;
    private String lastname;
    private int age;
    private Card card;
    private Basket basket;

    public Client(String firstName, String lastname, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    @Override
    public void payWithCard(double money) {
        System.out.println("**************************************************");
        basket.getAllProducts();
        System.out.println("Total: " + money);
        card.setBalance(card.getBalance() - money);
    }

    @Override
    public double getCardBalnce() {
        return card.getBalance();
    }
}
