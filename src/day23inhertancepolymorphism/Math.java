package day23inhertancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
       super("X");
        System.out.println("Constructor 1");
    }

    public Math(int a){

        this();
        System.out.println("Constructor 2");
    }
}

