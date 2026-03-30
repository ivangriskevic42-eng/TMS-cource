
public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234-5678-9012-3456", 1000.0);
        CreditCard card2 = new CreditCard("2345-6789-0123-4567", 500.0);
        CreditCard card3 = new CreditCard("3456-7890-1234-5678", 2000.0);
        System.out.println(" Начальное состояние карточек:");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
        System.out.println("\n Выполняем операции :");
        card1.deposit(500.0);
        card2.deposit(300.0);
        card3.withdraw(700.0);
        System.out.println("\n Текущее состояние всех карточек :");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}