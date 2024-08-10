import java.util.Arrays;

public class NonPrimitivedataType {
    public static void main (String[] args ){
        //string
//        The difference between a character array and a string in Java is, 
//        that the string is designed to hold a sequence of characters in a single variable whereas, 
//        a character array is a collection of separate char-type entities.

//        String s1="Hello World";
//        String s2= new String("hello");
//        System.out.println(s1);
        // primitive VS non primitive
        System.out.println("PRIMITIVE DATA TYPES\n");
        int x = 10;
        int y = x;
        System.out.print("Initially: ");
        System.out.println("x = " + x + ", y = " + y);
        // Here the change in the value of y
        // will not affect the value of x
        y = 30;

        System.out.print("After changing y to 30: ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(
                "**Only value of y is affected here "
                        + "because of Primitive Data Type\n");

        System.out.println("Non Primitive");
         int[]c={10,20,30,40};
         int[]d=c;
         System.out.println("value of c:" + Arrays.toString(c));
        System.out.println("value of d:" + Arrays.toString(d));
        System.out.println("\nModifying the value at "
                + "index 1 to 50 in array d\n");
        d[1]=50;
        System.out.println("after modifing strings value of c:" + Arrays.toString(c));
        System.out.println("after modifing strings value of d:" + Arrays.toString(d));
        System.out.println(
                "**Here value of c[1] is also affected "
                        + "because of Reference Data Type\n");
    }
}
