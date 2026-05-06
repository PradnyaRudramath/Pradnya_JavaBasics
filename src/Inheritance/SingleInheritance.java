package Inheritance;

//Single Inheritance---One Child-->One parent
class Parent2{
    String name="Parent name";

    void show(){
        System.out.println("Parent class "+name);
    }
}

class child extends Parent2{
    String name="Child name";       //This child name Hides parent's name
    void show(){
        System.out.println("Child class "+name);    //child's name
        System.out.println("Parent name "+super.name);   //parent name
        super.show();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
       // Parent2 parent=new Parent2();
        //parent.show();
        child child1=new child();
        child1.show();
    }
}
