package com.wallet.serviceimpl;

import java.util.*;

import com.wallet.model.User;
import com.wallet.service.Services;

public class Bank implements Services
{
	Scanner sc=new Scanner(System.in);
	User u=new User();
	public boolean login()
	{
		System.out.println("Enter User Id = ");
		u.setUserId(sc.next());
		System.out.println("Enter User Password = ");
		u.setUserPassword(sc.next());
		u.setAccountBalance(0.0);
		if(u.getUserId().equals("admin") && u.getUserPassword().equals("123"))
		{
			return true;
		}
		else if(u.getUserId().equals("employee")&& u.getUserPassword().equals("123"))
		{
			return true;
		}
		return false;
	}
	@Override
	public void viewBalance() 
	{
		System.out.println(" The Account Balance is = "+u.getAccountBalance());
	}

	@Override
	public void addMoney(double amount) 
	{
		u.setAccountBalance(u.getAccountBalance()+amount);
		System.out.println("Money Added Successfully ");
	}

	@Override
	public void withdrawMoney(double amount) 
	{
		if(amount<=u.getAccountBalance())
		{
			u.setAccountBalance(u.getAccountBalance()-amount);
			System.out.println(" Money Withdraw Successfully ");
		}
		else
		{
			System.out.println("Transaction canncelled due to insufficient funds");
		}
		
	}
	
}
