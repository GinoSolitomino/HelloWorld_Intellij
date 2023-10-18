package helloWorldIntellij.base;

import helloWorldIntellij.people.Programmer;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Programmer.saluta("Gino");
        Programmer x = new Programmer();
        x.name = "Pino";//se non diamo un valore a name il costruttore di default gli darà valore null
        x.level = 2;//se non diamo un valore a name il costruttore di default gli darà valore 0
        int bugs = x.sviluppa(10);
        // int bugs=Programmer.sviluppa(10);
        Programmer p1 = new Programmer("Alberto", 3);//Programmer p1 non è l'oggetto Programmer, è l'indirizzo di memoria dove si trova l'oggetto Programmer
        Programmer p2 = new Programmer("Rossana", 5);//Programmer p2 non è l'oggetto Programmer, è l'indirizzo di memoria dove si trova l'oggetto Programmer
        p1.sviluppa(20);
        p2.sviluppa(10);
        p2.sviluppa();
        int z1 = 3;
        int z2 = z1;
        z1 = 6;
        Programmer t1 = new Programmer("Gino", 2);
        Programmer t2 = t1;// 2 puntatori per lo stesso indirizzo
        t1.name = "Pippo";
        System.out.println(t2.name);//t2 sarà Pippo perchè punta allo stesso indirizzo di t1
        int[] ns = new int[]{2, 12, 7, 2, 4, 8};
        int max = findMax(ns);
        System.out.println(max);
        double[] numeri = {1.2, 5.3, 7.9, 4.5};
        double media = midVal(numeri);
        System.out.println("la media è " + media);
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int sumAll(int[] nums) {
        int somma = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            //somma=somma+nums[i]; è la stessa cosa della riga sotto
            somma += nums[i];
        }
        return somma;
    }

    public static int findMax(int[] numeri) {
        if (numeri.length == 0) {
            System.out.println("l'array è vuoto");
        }
        int max = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        return max;
    }

    public static double midVal(double[] num) {
        if (num.length == 0) {
            System.out.println("l'array è vuoto");
        }
        double mid = 0;
        for (int i = 0; i < num.length; i++) {
            mid += num[i];
        }
        mid = mid / num.length;
        return mid;
        //invece delle 2 righe sopra potevamo scrivere direttamente: return mid/num.lenght
    }

    public static boolean order(int[] nume) {
        if (nume.length == 0) {
            System.out.println("l'array è vuoto");
        }
        boolean ord = true;
        for (int i = 1; i < nume.length; i++) {
            if (nume[i] < nume[i - 1]) {
                ord = false;
            }
        }

        return ord;
    }
}
    /* public void setNomeFunzione(tipoVariabile nomeVariabileACuiAssegnamoUnValoreQuandoLaRichiamiamo){
    variabileDaModificare = nomeVariabileACuiAssegnamoUnValoreQuandoLaRichiamiamo;
    }
    serve per modificare una variabile privata da un file esterno alla funzione in cui è usata

     public int(o altro tipo di variabile che restituisce) getNomeFunzione() {
     return nomeVariabile;
     }
      */
/*esercizi da fare:
1) scrivere una funzione che riceve un array di double e ritorna il valore medio
2) scrivere una funzione che riceve un array di interi ordinati (se è vero che sono ordinati in ordine crescente ritorna true, altrimenti false)
3) scrivere una funzione che riceve un array di stringhe e restituisce la stringa che appare più volte( ad esempio pippo,pluto,paperino,pluto restituisce pluto),
se ci sono più stringhe che si ripetono lo stesso numero di volte ne restituisce una a caso

 */