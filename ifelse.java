import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a1=a.nextInt();
        System.out.print("Enter the value of b: ");
        int b=a.nextInt();
        if (a1>b){
            System.out.println("a is the greater number ");

        }else
        {
            System.out.println(" b is the greater number");
        } a.close();// closing is important to avoid memory leaks for the scanner object 
        //here the scanner object is a;
    }
}
