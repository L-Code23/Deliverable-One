import java.util.Scanner;
public class WhatToEat {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr=new Scanner(System.in);
int sodastock = 100;
int chipstock = 40;
int candystock = 60;
int sodarestock = 40;
int chiprestock = 20;
int candyrestock = 40;
int stock;
int restock;

	System.out.println("How many sodas have been sold today? 100 in stock");
		stock = scnr.nextInt();
		sodarestock = sodastock - stock;
		
	if (sodarestock >= 0) {	
	System.out.println("There are " + sodarestock + " sodas left." ); 
	}
		if (sodarestock > 100) {
	System.out.println("Too high, don't adjust the stock");
	} 
	System.out.println("How many chips have been sold today? 40 are in stock.");
		stock = scnr.nextInt();
		chiprestock = chipstock - stock;
		if (chiprestock >=0) {
	
			System.out.println("There are "+ chiprestock + " Chips left.");
		}
		
		if (chiprestock > 40) {
	System.out.println("Too high. Don't restock");
		}
	System.out.println("How many candies have been sold today? 60 are in stock");
			stock = scnr.nextInt();
			candyrestock = candystock - stock;
			if (candyrestock >=0) {
	
				System.out.println("There are " + candyrestock + " candies left.");
			}
			if (candyrestock > 60) {
	System.out.println("Too high. Don't restock");
				
				
				
		}
	System.out.println("Thank you for filling out the values. Here is what needs to be restocked");
			
	if (sodarestock <= 60) {
	System.out.println("Soda needs to be restocked.");
	}
			
	if(chiprestock <= 20) {
	System.out.println("Chips need to be restocked.");
	}
			
	if(candyrestock <= 40) {
	System.out.println ("Candy need to be restocked.");
		}  
	
			
	System.out.println("Goodbye!");
	
		
		
		
		
		}
}


