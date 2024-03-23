import java.util.Scanner;
public class WhatToEat {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr=new Scanner(System.in);

	System.out.println("How many sodas have been sold today? 100 in stock");
		int sodas = scnr.nextInt();
		int sodaleft = 100 - sodas;
	if (sodaleft >= 0) {	
	System.out.println("There are " + sodaleft + " sodas left." ); 
	}
		if (sodas > 100) {
	System.out.println("Too high, don't adjust the stock");
	} 
	System.out.println("How many chips have been sold today? 40 are in stock.");
		int chips = scnr.nextInt();
		int chipsleft = 40 - chips;
		if (chipsleft >=0) {
	
			System.out.println("There are "+ chipsleft + " Chips left.");
		}
		
		if (chips > 40) {
	System.out.println("Too high. Don't restock");
		}
	System.out.println("How many candies have been sold today? 60 are in stock");
			int candy = scnr.nextInt();
			int candyleft = 60 - candy;
			if (candyleft >=0) {
	
				System.out.println("There are " + candyleft + " candies left.");
			}
			if (candy > 60) {
	System.out.println("Too high. Don't restock");
				
				
				
		}
	System.out.println("Thank you for filling out the values. Here is what needs to be restocked");
			
	if (sodaleft <=40 && sodaleft >=0) {
	System.out.println("Soda needs to be restocked.");
	}
			
	if(chipsleft <=20 && sodaleft >=0) {
	System.out.println("Chips need to be restocked.");
	}
			
	if(candyleft <=40 && candyleft >=0) {
	System.out.println ( "Candy need to be restocked.");
		}  
	
			
	System.out.println("Goodbye!");
		
		
		
		
		}
}


