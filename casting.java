public class casting {
    public static void main(String[] args) {
    //casting is converting a data type another data type
    double price=200;
    double finalprice= price+ price*3;// implicit casting 
    System.out.println(finalprice);    
  //the size of double is 8 byte and int is 4 byte so we can convert double to int
  //but we cant convert int to double cuz int cant support the size of double
  int p=100;
  int newp= p+ (int)(p/3);
  //this deletes the decimal part of the double
  System.out.println(newp);
  // we can convert int to double by adding .0 to the int
  double newprice= p+(p/3.0);// explicit casting
  System.out.println(newprice);
    }
}
