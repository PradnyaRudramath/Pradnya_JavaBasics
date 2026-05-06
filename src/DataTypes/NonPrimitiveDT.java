package DataTypes;
import java.util.logging.Level;

public class NonPrimitiveDT {

    enum dept{
        IT,
        Network,
        HR};

    public static void main(String[] args) {
        //Non-primitive data types store references (memory addresses) rather than actual values.
        // They are created by users and include types like String, Class, Object, Interface, and Array.

        String programming_lang="Java";  //without new keyword--> SCP---172hghva
        System.out.println(programming_lang);

        Object str2="Java";    //without new keyword--? SCP---zz8723a
        System.out.println(str2);

        String str=new String("Java");   //with new keyword---> heap--gg77912a
        System.out.println(str);

        System.out.println(programming_lang==str);
        System.out.println(str2==programming_lang);

        dept str5= dept.Network;
        System.out.println(str5);
    }
}
