package Inheritance;

//Hierarchical Inheritance--- One Parent--Multiple chide
    class Person{
        String name;
        int age;

        void eat(){
          System.out.println(name +" is eating");
        }
         void sleep(){
          System.out.println(name +" is sleeping");
         }
    }

    class Student extends Person{

        void study(){
            System.out.println(name +" is studying");
        }
    }

    class Teacher extends Person{
        void teach(){
            System.out.println(name +" is teaching");
        }
    }

public class WithInheritance {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="John";
        student.age=20;
        student.eat();
        student.sleep();
        student.study();

        Teacher teacher=new Teacher();
        teacher.name="Ram";
        teacher.age=30;
        teacher.eat();
        teacher.sleep();
        teacher.teach();

    }

}
