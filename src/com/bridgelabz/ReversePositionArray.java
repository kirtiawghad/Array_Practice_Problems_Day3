package com.bridgelabz;

import java.util.Scanner;

public class ReversePositionArray {
    public static void main(String[] args) {
        int [] num = new int[5];
        System.out.println("enter the 5 element od array");
        Scanner sc = new Scanner(System.in);
        num[0]= sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();
        System.out.println("Reverse Position Array");
        for (int i = num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }
    }
}
