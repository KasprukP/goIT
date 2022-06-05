package udemyLessons;

public class BankAccount {
    int id;
    String name;
    double balance;

    static class BankAccountTest {
        public static void main(String[] args) {


            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Pavel";
            MyAccount.balance = 12.34;

            YourAccount.id = 2;
            YourAccount.name = "Oleg";
            YourAccount.balance = 122.34;

            HisAccount.id = 3;
            HisAccount.name = "Gleb";
            HisAccount.balance = 11.34;

            System.out.println(MyAccount.name + MyAccount.id+MyAccount.balance);
        }
    }
}
