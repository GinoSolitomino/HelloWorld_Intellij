package helloWorldIntellij.people;

public class Programmer {
    public int level;
    public String name;
    public Programmer(){
        System.out.println("chiamato costruttore di default");
    }
    public Programmer(String n,int lev){
        name=n;
        level=lev;
    }
    public static void saluta(String name){
        System.out.println("ciao " + name);
    }
    public int sviluppa(int lines){
        System.out.println(name + " Sta scrivendo " + level*lines + " linee di codice ");
        return lines/3;
    }
    public int sviluppa(){
        System.out.println(name + " Sta scrivendo poche righe di codice");
        return 0;
    }
}
