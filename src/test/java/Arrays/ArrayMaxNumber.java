package Arrays;

public class ArrayMaxNumber {
    public static void main(String[] args) {
         /*
         1. Assume first element is max
         2. Traverse array
         3. If current element > max → update max
          */

        int arr [] = {1,2,3,4,5};

        int max = arr[0];

        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > max){
                max = arr [i];
            }
        }
        System.out.print(max);
    }
}
