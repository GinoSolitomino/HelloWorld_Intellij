package helloWorldIntellij.bank;

import java.time.LocalDate;

public class Client {
    private long id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private Sex sex;
    private Account[] accounts;
    private CaymanAccount[] caymanAccounts;
    private int numAccounts;
    public final static int MAX_ACCOUNTS = 5; // creiamo una costante pubblica(potremmo usarla in giro quindi va bene farla pubblica) con il massimo numero di accounts per ogni cliente. la definiamo static perchè così ci sarà una sola costante assegnata alla classe( se non la mettiamo static ci sarà una costante per ogni cliente, quindi creando 100 clienti ci saranno 100 costanti MAX_ACCOUNTS)
    public Client(String firstname, String lastname, LocalDate birthdate, Sex sex){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.sex = sex;
        this.accounts = new Account[MAX_ACCOUNTS]; // crea un array di account con 5 celle vuote
    }
    public boolean addAccount(Account a){
        if (numAccounts == accounts.length){
            return false;
        } else {
            accounts[numAccounts] = a;
            numAccounts++;
            return true;
        }
    }
}
