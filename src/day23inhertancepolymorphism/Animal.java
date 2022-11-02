package day23inhertancepolymorphism;

public class Animal {

    public void eat() {
        System.out.println("Animals eat ");
    }

    public int add(int a, int b) {

        return a + b;
    }

    public Integer multipl(int a, int b) {

        return a * b;
    }

    public Animal create(){
        return new Animal();
    }

    public final double divide(int a, int b){
        return a/b;
    }
}