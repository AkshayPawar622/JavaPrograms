package Arrays;

public class ArrayElementAddition {

    /* 1. Declare array
       2. Initialize count variable
       3. Traverse through the array
       4. condition add first elemnt into the next
     */
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,9};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++){
            sum = sum+ arr[i];
        }
        System.out.println(sum);

    }


}
