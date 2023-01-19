package class11;

import java.util.Scanner;

public class DogTesting {
    public static void main(String[] args) {
        // creating an actual object from the class Scanner
        Scanner input=new Scanner(System.in);
        // This is how we create objects from the class
        Dog Mickey=new Dog();
        Mickey.name="Mickey";
        Mickey.breed="Huskey";
        Mickey.age=2;
        Mickey.colour="BlackAndWhite";
        Mickey.weight=2.5;

        Mickey.bark();
        Mickey.sleep();
        Mickey.drink();
        Mickey.Playing();
        Mickey.eat();




        Dog Lucky=new Dog();
        Lucky.name="Lucky";
        Lucky.breed="Labrador";
        Lucky.age=5;
        Lucky.colour="Brown";
        Lucky.weight=5.3;

        Lucky.bark();
        Lucky.sleep();
        Lucky.drink();
        Lucky.Playing();
        Lucky.eat();



        Dog BoBo=new Dog();
        BoBo.name="BoBo";
        BoBo.breed="BullDog";
        BoBo.age=3;
        BoBo.colour="Black";
        BoBo.weight=3.8;

        BoBo.bark();
        BoBo.sleep();
        BoBo.drink();
        BoBo.Playing();
        BoBo.eat();






    }
}
