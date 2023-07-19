package com.bridgelabz;

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] num = new int[5];
        System.out.println("enter the 5 element od array");
        Scanner sc = new Scanner(System.in);
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        num[3] = sc.nextInt();
        num[4] = sc.nextInt();

        int temp;
        int size = num.length;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("Second Largest Element :" + num[size-2]);

    }
}
