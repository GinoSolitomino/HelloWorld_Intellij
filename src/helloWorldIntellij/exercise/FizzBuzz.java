package helloWorldIntellij.exercise;

public class FizzBuzz {
    public static void main(String[] args) {
//        if(args.length>0 && "go".equals(args[0])){
//            System.out.println("faccio l'operazione 1");
//        } else{
//            System.out.println("faccio l'operazione 2");
//        }
        System.out.println(calculateFibo(7));
        System.out.println(calculateFiboIterative(7));
    }
    public static void doFizzBuzz(int limit){
        for(int i=1; i<=limit; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0){
                System.out.println("Buzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static String reverse(String target){
        String rev = "";
        for (int i=0; i<target.length(); i++){
            rev = target.charAt(i) + rev;
        }
        return rev;
    }
    public static boolean isPalindrome(String target){
        return target.equals(reverse(target));// ritorna true se richiamando la funzione di prima e confrontandola con la stringa che diamo è un palindromo
    }
    public static boolean isPalindrome2(String target){
        for (int i=0; i<target.length()/2; i++){
            if(target.charAt(i) != target.charAt(target.length() -1 -i)){
                return false;
            }
        }
        return true;
    }
    public static long calculateFactorial(int target){
        int factorial = 1;
        for (int i=2; i<=target; i++ ){
            factorial *= i;
        }
        return factorial;
    }
    public static long calculateFactorialRecursive(int target){
        if (target == 0){
            return 1;
        }
        return target * calculateFactorialRecursive(target-1);
    }

    //serie di fibonacci(1,1,2,3,5,8,13,21...) diamo il numero della posizione e ci restituisce i valore di fibonacci in quella posizione
    public static long calculateFibo(int position){
        if(position<=2){
            return 1;
        }
        return calculateFibo(position - 1) + calculateFibo(position -2);
    }
    public static long calculateFiboIterative(int position){
        if(position<=2){
            return 1;
        }
        long previous = 1;
        long current = 1;
        for(int i=2; i<position; i++){
            long fibo = previous + current;
            previous = current;
            current = fibo;
        }
        return current;
    }
}
