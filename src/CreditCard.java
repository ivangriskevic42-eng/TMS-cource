
class CreditCard {
    private String accountNumber;
    private double balance;
    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На карту " + accountNumber + " начислено: " + amount);
        } else {
            System.out.println("Ошибка: сумма начисления должна быть положительной");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("С карты " + accountNumber + " снято: " + amount);
            } else {
                System.out.println("Ошибка: недостаточно средств на карте " + accountNumber);
            }
        } else {
            System.out.println("Ошибка: сумма снятия должна быть положительной");
        }
    }
    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber + ", Текущая сумма: " + balance);
    }
}