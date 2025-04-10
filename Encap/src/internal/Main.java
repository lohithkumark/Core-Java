package internal;


import external.Animal;
import external.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal =  new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();
        dog.fetch();


    }
}
