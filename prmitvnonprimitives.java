public class prmitvnonprimitives {
    //basically 2 types of numbers 
    //1) Primitive type(simple value stored). 2) Non-primitive types(reference type where complex values stored).
    public static void main(String[] args) {
    //byte-1 byte memory consumption[-128 to 127]
    //long-8 byte memory consumption
//int - 4 BMC
// float- 4 BMC
//char -2 BMC
// boolean - 1 BMC
//Primitives (just basic int,float, double ,char etc types) EXAMPLE :
float s=3.14F;
System.out.println(s);
/*Non-primitive types (basically where many primitive types for example 
character types get combined into one type for example string,
 where string is the non-primitive and char is the primitive) 
 EXAMPLE :*/
String a= "sujoy";
System.out.println(a.length());
//non-primitive types have to be declared with the keyword "new"
String n= new String("supriya");
String n2= n.replace('a','o');
System.out.println(n +" is actually "+ n2);
    }
}
