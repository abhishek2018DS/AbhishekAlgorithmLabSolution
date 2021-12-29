package com.greatlearning.paymoney;
import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        int size= sc.nextInt();
        
        System.out.println("Enter the value of array");
        int valArray []= new int[size];
        
        for (int i = 0; i < size; i++) {
        	valArray[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int target = sc.nextInt(); 
        
         
        
        while(target-- !=0)
        	{
        	int flag =0; 
        	long sum = 0;
        	long amount;
        	System.out.println("Enter the value of target");
        	amount= sc.nextInt();
        	//implementing linear searching         {
        	for (int i =0; i < size; i++){
        		  	sum += valArray[i];
        		  	if (sum >= amount){
        		  		System.out.println("Target can be achieved in "+(i+1) +" transaction");
        		  		flag = 1;
        		  		break;
        		  	}
        		 }
        	        		  	
        	if (flag == 0){
        		System.out.println("Given target is not achieved");
        		}
        	}
        }
  	}  
       
