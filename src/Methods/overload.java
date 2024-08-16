package Methods;

public class overload {
    public static void main(String[] args) {
        fun("i am kira");
        fun(45);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
