package BasicOfjava;

public class PrimitiveDataType {
    public static void main (String[] args) {
//        //non numeric data types
//        boolean boolvar=true; // 1byte==>8bits
//        char charvar='C';   // 2byte= 16bits
//        /// Numeric data types
//        //integer
//        int intvar=34;     //4bytes ==>32bits
//        short shortvar=10; //2bytes ==>16bits
//        long longvar=12589745368; // 8bytes ==> 64bits
//        byte bytevar;   // 1byte==>8bits
//
//        //floating point value
//        float floatvar; // 4bytes ==>32bits
//        double doubvar; // 8bytes ==>64bits

        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}
