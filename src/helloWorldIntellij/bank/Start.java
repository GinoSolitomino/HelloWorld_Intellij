package helloWorldIntellij.bank;

public class Start {
    public static void main(String[] args) {
        Account a1 = new Account(100);
        System.out.println(a1.getBalance());
        CaymanAccount c1 = new CaymanAccount(2000, "abc");
        double s = c1.deposit(100);
    }
}
