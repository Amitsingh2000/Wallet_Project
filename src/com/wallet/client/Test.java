package com.wallet.client;

import java.util.Scanner;

import com.wallet.serviceimpl.Bank;

public class Test {
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		Bank d=new Bank();
		//Login id = admin Password = 123
		//Login id = Employee Password =123
		System.out.println("<---User Login Form--->");
		if(d.login()==true)
		{
			loop :while(true)
			{
				
				System.out.println("Enter Choice \n"
						+ "1.For View Balance \n"
						+ "2.For Add Money \n"
						+ "3.For withdrawMoney \n");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						d.viewBalance();
						break;
					case 2:
						System.out.println("Enter Amount For Add Money = ");
						d.addMoney(sc.nextDouble());
						break;
					case 3:
						System.out.println("Enter Amount For Wihdraw Money =");
						d.withdrawMoney(sc.nextDouble());
						break;
					default:
						break loop;
				}
			}
		}
		else
		{
			System.out.println("Enter Valid Login Details");
		}
}
	

}
