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
int sold;

	System.out.println("How many sodas have been sold today? There are " + sodastock + " in stock. ");
		sold = scnr.nextInt();
		stock = sodastock - sold;
		
	if (stock <= sodastock) {	
	System.out.println("There are " + stock + " sodas left." ); 
	} // I see what you are saying about using variables instead of hard coding a number
		if (stock > sodastock) {
	System.out.println("Too high, don't adjust the stock");
	} 
	System.out.println("How many chips have been sold today? There are " + chipstock + " in stock.");
		sold = scnr.nextInt();
		stock = chipstock - sold;
		if (stock <= chipstock) {
	
			System.out.println("There are "+ stock + " Chips left.");
		}
		
		if (stock > chipstock) {
	System.out.println("Too high. Don't restock");
		}
	System.out.println("How many candies have been sold today? There are " + stock + " in stock");
			sold = scnr.nextInt();
			stock = candystock - sold;
			if (stock <= candyrestock) {
	
				System.out.println("There are " + candyrestock + " candies left.");
			}
			if (stock > candystock) {
	System.out.println("Too high. Don't restock");
				
				
				
		}
	System.out.println("Thank you for filling out the values. Here is what needs to be restocked");
			
	if (stock <= sodarestock) {
	System.out.println("Soda needs to be restocked.");
	}
			
	if(stock <= chiprestock) {
	System.out.println("Chips needs to be restocked.");
	}
			
	if(stock <= candyrestock) {
	System.out.println ("Candy needs to be restocked.");
		}  
	
			
	System.out.println("Goodbye!");
	
		
		
		
		
		}
}


