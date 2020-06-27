package com.tts;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for ( i=0; i<arr.length; i++ )
            arr[i] = 1 + r.nextInt(100);

        // Display it
        System.out.print("before: ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Sort it
        // bubble_sort( arr );

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
        public static void bubble_sort( int[] a )
        {

            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap arr[j+1] and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }


        public static void swap( int[] a , int i, int j ){


                    }
}








