package Methods;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
   varArg(2,3,30,56,0,94);
   multiple(5,3,"Naushin","Kira","Light","L");
    }

    private static void multiple(int a,int b, String...v) {
        System.out.println(a+" "+b+""+ Arrays.toString(v));
    }

    static void varArg(int...v){
        System.out.println(Arrays.toString(v));
    }
}
