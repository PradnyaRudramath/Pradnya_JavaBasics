package Operators;

public class JavaOperators {
    static void main(String[] args) {

        int a=9; int b=3; int c=5;
        String str1="Java";
        String str2="Program";
        //String str3=new String("Java");

        //additional operator
        System.out.println(a+b);
        System.out.println(str1+" "+str2);

        //subtraction
        System.out.println(b-a);

        //multiplication
        System.out.println(a*b);

        //division
        System.out.println(b/a);

        //modulus
        System.out.println(c%b);

        //relational operator----> mostly used in testing
        System.out.println(a==b);
        System.out.println(a!=b);

        //Ternery operator
        //condition? expression1 : expression2;
        String size=(a>5)? "Greater":"Lesser";
        System.out.println(size);
    }
}