package Inheritance;

//Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor : " + name);
    }
}

//child class
class Dog extends Animal {
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog Constructor : " + breed);
    }

}
public class ConstructorInheritance
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Jimmy", "Labrador");
        System.out.println("Animal name is : " + d1.name);
        System.out.println("Dog breed is : " + d1.breed);
    }
}
