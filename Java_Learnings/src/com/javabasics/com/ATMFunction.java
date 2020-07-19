package com.javabasics.com;

import java.util.Scanner;

public class ATMFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 10000, withdrawn , deposit, pin=1406;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Insert your Card & Enter the Pin number ");
		int	upin = sc.nextInt();
		
		if(pin==upin) {
			 System.out.println(" Welcome to XYZ Banking ATM Function ");
			 System.out.println("1 >> Withdrawn Money");
			 System.out.println("2 >> Deposit Money ");
			 System.out.println("3 >> Check Balance  ");
			 System.out.println("4 >> Exit Bank ");
			 System.out.println(" Please Select select your banking option  ");
			 int opt = sc.nextInt();
			 
			 switch (opt) {
			case 1:
				System.out.println(" ");
				
				break;

			default:
				break;
			}
			
		}
		else {
			System.out.println("Invalid Pin Number ..!!! please contact to Bank ");
		}
		
		
	}

}
