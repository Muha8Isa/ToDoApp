package se.lexicon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person mohammad = new Person(123, "Mohammad", "Alissa","example@hotmail.com");
        System.out.println(mohammad.toString());
        Person jack = new Person(124, "Jack", "Warack","exempel@gmail.com");
        System.out.println(jack.toString());

        TodoItem clean = new TodoItem(222, "clean", "clean the house");
        System.out.println(clean.toString()); // This also works without toString(); System.out.println(clean); It means that I either can call it explicitly toString() or implicitly without toString().
    }


}