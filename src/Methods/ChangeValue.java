package Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[]arr={1,20,30,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

  static void change(int[] nums) {
      nums[0]=99;
    }
    //here it is change because it is pass by value i.e, arr and nums are pointing to same object.
}
