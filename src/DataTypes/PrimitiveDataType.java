package DataTypes;

public class PrimitiveDataType {

    public static void main(String[] args)
    {
        //integer type-- (whole number)-- byte,int,short,long
        //byte num1---> declaration
        //num1=1000---> assignment
        byte num1 = 127; //-127 to 127   //1 byte
        System.out.println(num1);

        short num2=1000; //-32000 to 32500  //2 byte
        System.out.println(num2);

        int num3=50000;   // 4 byte
        System.out.println(num3);

        long num4;
        num4=1000000000L; // L mandatory
        System.out.println(num4);

        //Floating datatype (decimal numbers)
        //float 10.88878 , double 10.878787878787

        float decnum=10.726386386f;   // f is mandatory
        System.out.println(decnum);

        double decnum1=10.72638638631;
        System.out.println(decnum1);

        //character datatype---// 2byte
        char grade='A';
        char symbol='^';
        char number='1';
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(number);

        //boolean // 1 byte
        boolean isJava_a_lang=true;
        System.out.println(isJava_a_lang);
    }

}

