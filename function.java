public class function {
    public static void printjava() {
        System.out.println("java");
    }
    public static void name(String a, String b) {
        System.out.println(a);
        System.out.println(a+b);
    }
    public static void main(int s,int d) {
        int sum= s+d;
System.out.println(sum);
    }
    public static void main(String[] args) {
        //methods are just functions in classes
        printjava();
        printjava();printjava();
        printjava();printjava();
        name("sujoy","hello");
        main(2, 3);
    }
}
