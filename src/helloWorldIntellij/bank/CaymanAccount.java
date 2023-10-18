package helloWorldIntellij.bank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CaymanAccount extends Account {
    private String secretCode;
    public CaymanAccount (double bal, String secretCode){
          super(bal);
          this.secretCode = secretCode;
//        super();    se aggiungiamo un costruttore di base (cioè: public Account(){}) nella classe madre(Account) possiamo usare super() senza passare parametri, ma è sbagliato
//        this.balance = bal; se facciamo il lavoro della riga sopra dobbiamo usare questa sintassi per usare il parametro bal con la variabile balance della classe madre, ma è sbagliato perchè inizializziamo una variabile della classe madre nella classe figlia
//        this.secretCode = secretCode;
    }
    public double evadeTax (){
        this.balance *= 1.05;
        return this.balance;
    }
    // Override
    @Override
    public double deposit(double amount){
        DayOfWeek today = LocalDate.now().getDayOfWeek();
//        LocalDate todayDate = LocalDate.now(); è la stessa cosa della riga sopra ma con più passaggi
//        DayOfWeek today = todayDate.getDayOfWeek();
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY){
            balance += amount * 1.1;
        } else {
            balance += amount;
        }
        return balance;
//        LocalDate dataAttuale = LocalDate.now();  è la stessa cosa di sopra ma meno leggibile
//        if (dataAttuale.getDayOfWeek() == DayOfWeek.SATURDAY || dataAttuale.getDayOfWeek() == DayOfWeek.SUNDAY){
//        }
    }
}
