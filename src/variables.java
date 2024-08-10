public class variables {
    static int m=10;//static variable

    public static void main(String [] args){
        // X is a local variable
        int x=10;
        // message is also a local
        // variable
        String message = "Hello, world!";

        System.out.println("x = " + m);
        System.out.println("message = " + message);

        if(x>5){
            //result is a local variable
            String result="X is grater than 5";
            System.out.println(result);
        }
//        System.out.println(result);
    }

}
