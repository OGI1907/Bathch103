package day22inheritanceolymorphism;


public class Mammal extends Animal {

    public int a = 13;

    public int b = 34;

    public void eat(){
        System.out.println("Mammaml Eat");

    }

    public void drink(){
        System.out.println("Mammal Drink");
    }

    public Mammal(){
        System.out.println("Mamma");
    }
}
