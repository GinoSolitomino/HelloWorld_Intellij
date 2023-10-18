package helloWorldIntellij.bank;

public class Account {
    protected double balance;
    private long id;
// se non diamo visibilità(private,public,protected...) la variabile ha visibilità solo di package


    public Account (double balance){ // il costruttore ha lo stesso nome della classe
        this.balance = balance ; // il this contiene l'indirizzo dell'oggetto che stiamo creando quindi this.balance assegna alla variabile dell'oggetto che creiamo il valore del parametro balance del costruttore(alla fine è come se facesse return this)
    }


    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    public boolean withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
    public boolean transfer(double amount, Account target){//è un trasferimento di soldi tra conti quindi useremo l'oggetto che abbiamo creato Account
        if(balance>=amount){
            balance -= amount;
            target.balance += amount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
    public void setId(long id){
        this.id = id; // come per balance più in alto nel codice this.id assegna alla variabile id dell'oggetto che creiamo l'id parametro del metodo(il this contiene l'indirizzo dell'oggetto a cui stiamo applicando il metodo)
    }
}
