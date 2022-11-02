package day23inhertancepolymorphism;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }
    //Asagidaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }
    }





