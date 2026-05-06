package Inheritance;

//MultiLevel--- Grandeparent---> Parent--->Child-->Grandchild

//Grandparent
class Animal1 {
   /*String name;
    Animal1(String name){
        this.name=name;
        System.out.println("Animal1 Constructor : " + name);
    }
    */
    void eat() {
        System.out.println("Eating food");
    }

        void drink(){
            System.out.println("Sleeping");
        }
    }


//Parent
class Mammal extends Animal1{
   String name;
    Mammal(String name){
        System.out.println("Mammal Constructor : " + name);
    }


    void walk(){
        //super.eat();
        System.out.println("Walking with legs");
    }
}

//Child
class Dog2 extends Mammal{
    String name;
    Dog2(String name){
        super(name);
        System.out.println("Dog2 Constructor : " + name);
    }
    void bark(){
        //super.eat();
        System.out.println("Barking dog");
    }
    void hide(){
        System.out.println("Hiding dog");
    }
}

public class MultiLevelInheritance {
    static void main(String[] args) {
        Dog2 dg=new Dog2("Jimmy");
        dg.drink();
        dg.hide();
       // super.
        //dg.bark();
        //dg.walk();
        //dg.bark();

    }

    }

