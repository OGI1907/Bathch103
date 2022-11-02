package day22inheritanceolymorphism;

public class Runner {

    public static void main(String[] args) {


       //Inhetirence da variable lar secilirken Java object in data type ina bakar
       //Oncelikli istediginiz variable i Object in data type i olan Class da arar
       // O Class larda bulamazsa Parent Class lara bakar
       // Hicbir Parent Class da bulamazsa hata verir.

        Cat cat1 = new Cat();
        System.out.println(cat1.a); //14
        System.out.println(cat1.b); //34
        System.out.println(cat1.c); //45


        Mammal cat2 = new Cat();
        System.out.println(cat2.a);

        Animal cat3 = new Cat();
        System.out.println(cat3.a);

        //Object olusturuken Object in data type'i Child Class lardan secilemez

       //Inhetirance da variable lar secilirken Java Constructor a bakar
       // Oncelikle istediigniz method u Constructori kullanilan Class dan alir
       //O class da bulamazsa Parent Class lara bakar
       // Hicbir yerde o method u bulamazsa hata verir
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();// Mammal Drink

        Mammal cat5 = new Mammal();
        cat5.eat(); //Mammal Eat

        Animal catt6= new Animal();
        catt6.eat(); //Animal eat

        Animal cat7 = new Animal();


    }
}
