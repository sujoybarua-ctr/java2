import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter your name:");
String name=a.nextLine();
System.out.println("youre "+ name +" ?");
System.out.print(name+ ", tell me what your age is :");
int age=a.nextInt();
System.out.print("your age is "+ age+" ? "); a.close();
    }
}
