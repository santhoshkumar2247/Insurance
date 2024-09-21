package com.typecasting;

import java.util.*;

public class ATM_Project {

	public static void main(String[] args) {
		int pin = 1234;
		int balance=10000;
		
		int addAmount=0;
		int takeAmount=0;
		
		String name;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your pin number");
	
		int pwd = sc.nextInt();
		
		if(pwd == pin) {
			System.out.println("Enter your name");
			name = sc.next();
			System.out.println("Welcome "+name);
			
			while(true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to add your amount");
				System.out.println("Press 3 to take your amount");
				System.out.println("Press 4 to take your receipt");
				System.out.println("Press 5 to Exit!");
				
				int opt = sc.nextInt();
				
				switch(opt)
				{
					case 1: System.out.println("Your current balance is "+balance);
					break;
					
					case 2:System.out.println("How much amount did you want to ADD to your account");
					addAmount = sc.nextInt();
					System.out.println("Amount successfully credited");
					balance = addAmount + balance;
					break;
					
					case 3: System.out.println("How much amount did you want to withdraw");
					takeAmount = sc.nextInt();
					if(takeAmount > balance) {
						System.out.println("Insufficient Balance");
					}
					else
					{
						System.out.println("Successfully Withdraw");
						balance= balance-takeAmount;
					}
					break;
					
					case 4:
								System.out.println("Welcome to All in One mini ATM");
								System.out.println("Available balance is "+balance);
								System.out.println("Amount deposited "+addAmount);
								System.out.println("Amount taken "+takeAmount);
								System.out.println("Thanks for Coming");
					break;
					
					case 5: System.out.println("Thank You");
					break;
					
					default:System.out.println("Invalid Entry");
				}
				
			}
			
		}else {
			System.out.println("Invalid pin number");
		}
	}

}
