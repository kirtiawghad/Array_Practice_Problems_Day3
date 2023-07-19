package com.bridgelabz;

import java.util.Scanner;

public class LargestElementArray {

    public static void main(String[] args) {

        int [] num = new int[5];
        System.out.println("enter the 5 element od array");
        Scanner sc = new Scanner(System.in);
        num[0]= sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();

        int max = num[0];
        for (int i=0; i<num.length; i++){
            if (num[i]>max){
                max = (num[i]);
            }
        }
        System.out.println("Max Element is :" + max);

    }

}
