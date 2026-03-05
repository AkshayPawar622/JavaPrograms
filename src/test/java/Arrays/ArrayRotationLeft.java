package Arrays;

public class ArrayRotationLeft {
    /*
       1. store first element
       2. shift array to left by 1 (traverse array from start to end)
       3. add first element to last index
     */
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int start = arr[0];

        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i]= arr[i+1];
        }

        arr[arr.length-1] = start;

        for(int num : arr){
            System.out.print(num);
        }
    }
    }

