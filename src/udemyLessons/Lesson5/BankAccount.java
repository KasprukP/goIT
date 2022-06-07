package udemyLessons.Lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(double bank) {
        balance += bank;
        return balance;

    }

    double snytieSoScheta(double bank) {
        balance -= bank;
        return balance;
    }

    void showInfo() {
        System.out.println("Imja " + name + " Balans " + balance);
    }

    static class BankAccountTest {
        public static void main(String[] args) {


            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Pavel";
            MyAccount.balance = 50;
            System.out.println("Balans do popolneniya: " + MyAccount.balance);
            System.out.println("Balans posle popolneniya: " + MyAccount.popolnenieScheta(30));
            System.out.println("Balans posle snyatiya: "+ MyAccount.snytieSoScheta(20));



        }
    }
}
