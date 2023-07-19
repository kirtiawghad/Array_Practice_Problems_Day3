package com.bridgelabz;

public class FrequncyOfElementArray {
    public static void main(String[] args) {
        int [] numbers = {1,3,4,6,6,3,4,4,8,9,3,2,};
        int [] frequncy = new int [numbers.length];
        int counted = -1;

        for (int i=0; i<numbers.length; i++){
            int count = 1;
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    count++;
                    frequncy[j] = counted;
                }
            }
            if (frequncy[i] != counted){
                frequncy[i] =count;
            }
        }
        //print element
        for (int i=0; i<frequncy.length; i++){
            if (frequncy[i] != counted){
                System.out.println("numbrs"+ " " + numbers[i] + " " + "frequncy" +" "+ frequncy[i]);
            }
        }
    }
}
