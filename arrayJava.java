import java.util.Arrays;
public class arrayJava {
    public static void main(String[] args) {
        
int [] a= new int [5]   ;
a[0]=23;
a[1]=15;
a[2]=12;
System.out.println(a[0]);
//the diff between c++/c and java is that in java we have to declare the size of the array
//another difference is that if there is no value in the array then it will be 0 by default
//if the values data type is boolean then it will be false by default
//if the values data type is char then it will be null by default
//EXAMPLE:
boolean [] b= new boolean[5];
System.out.println(b[4]);
char [] c= new char[5];
System.out.println(c[4]);
//if we want to declare the values of the array in one line then we can do it like this
int [] d= {1,3,9,6,5};
System.out.println(d[4]);
//for sorting the array we can use the sort function
// to use the sort function must import the Arrays class which is in the util package
Arrays.sort(d);
System.out.println(d[2]);
    }
    
}
