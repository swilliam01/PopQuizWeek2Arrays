package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare the array
        int[] array = new int [5];

        //populate it
        array[0]=2;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;

        //get the length of the array
        System.out.println(array.length);

        //printing values in the array
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

        // populate array with user input
        System.out.println("Please enter numbers");

        for(int j =0; j< (array.length - 1); j++){
            //saving values in the array
             array[j] = input.nextInt();
        }
        //printing the values in the array
        for(int j =0; j< (array.length - 1); j++) {
            System.out.println(array[j]);
        }




    }


}
