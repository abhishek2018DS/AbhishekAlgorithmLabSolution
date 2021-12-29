package com.greatlearning.driver;
import com.greatlearning.mergesort.MergeSortImplementation;

import java.util.Scanner;

class Driver{
    public static void main(String [] args){
        System.out.println("Enter the size of currency denomination");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        System.out.println("Enter the currency denominations value ");
        int curArray []= new int[size];
        for(int i=0; i< size; i++){
            curArray[i]= sc.nextInt();
            }
        System.out.println("Enter the amount you want to pay ");
        int amount= sc.nextInt();
        //int n = sc.nextInt();
        //int arr[] = {1,2,5,10,20,50,100,500,1000};
        int note_count[] = new int[size];
        MergeSortImplementation ob = new MergeSortImplementation();
        ob.sort(curArray, 0, curArray.length-1);
        for(int i=size-1; i>=0; i--)
        {
            if(curArray[i]<=amount){
                note_count[i] += amount/curArray[i];
                amount = amount- note_count[i]*curArray[i];
                }
        }
        //System.out.println(note_count);
        

        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i=size-1; i >=0; i--) {
            if (note_count[i] != 0) {
                System.out.println(curArray[i] + ":"+ note_count[i]);
            }
        }
    }
}
