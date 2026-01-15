package section1;
public class Swap2 {
    public static void main(String []args){
        // using temporary variable
        int a = 12;
        int b = 45;
        int temp =0;
        temp = a;
        a=b;
        b=temp;
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        System.out.println("-----------------------");
        // Without using temporary variable
        int c= 23;
        int d= 43;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("Value of c is: "+c);
        System.out.println("Value of d is: "+d);
    }
}
