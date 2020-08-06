package day26_MultiDimensionalArray;
/*
 * warmup tasks:
    1. write a program that can sort the array in descending order
            ex:
                arr1: { 10, 11, 8, 9, 12, 5, 15};
                output:
                    arr2: {15, 12, 11, 10, 9, 8, 5}
                NOTE: at the end, you must have have an array that contains the desending order of the original array
                2 1 3
                1 2 3
                3 1 2
    2. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

 */

import java.util.Arrays;

public class MultiD_Array {


    public static void main(String[] args) {
        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

        //                   0    1       0    1   2        0    1    2
        char[][]  ch2D = { {'A', 'B'},  {'C', 'D', 'E'},  {'F', 'G', 'H'} };
        //                      0               1                  2

        System.out.println(   Arrays.toString( ch2D[1]  ) );

        System.out.println(  Arrays.toString( ch2D[2]  )  );

        // H
        System.out.println( ch2D[2][2] );

        // C
        System.out.println( ch2D[1][0] );

        // G  B
        System.out.println( ch2D[2][1]+"    "+  ch2D[0][1] );

        System.out.println("===============================================================");
        // {1,2,3} , {4} , {5,6},  {7,8,9, 10}

         //   int[] arr1D = {  {1,2,3}  };


        int[][]  nums = { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} };
        //                   0        1      2          3


        // [7,8,9, 10]
      //  System.out.println(  Arrays.toString( nums[3] ) );

        /*
        {1,2,3}
        {4}
        {5,6}
        [7,8,9, 10]
         */

        for(int i =0; i <= nums.length-1; i++ ){
            System.out.println( Arrays.toString(nums[i] ) );
        }


        // { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} }
       // System.out.println(Arrays.toString(nums));
        System.out.println( Arrays.deepToString(nums));




    }


}
