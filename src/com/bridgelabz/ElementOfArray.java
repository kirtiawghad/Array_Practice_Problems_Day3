package com.bridgelabz;

import java.util.Scanner;

public class ElementOfArray {
    public static void main(String[] args) {
        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of array :");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

        //sum of array
        int total = 0;
        for(int i =0; i<arr.length; i++){
            total = total + arr[i];
        }
        System.out.println("element of array");
        System.out.println("total is :"+ total);

        // max array of index
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max is :" + max);

        //smalllest element of array
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("min is :" + min);

        //array even position
        System.out.println("even array");
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                  System.out.println(arr[i]);
            }
        }
        //reverce array
        System.out.println("reverce array");
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        //odd array
        System.out.println("odd array");
        for (int i = 0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
