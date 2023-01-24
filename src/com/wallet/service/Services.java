package com.wallet.service;

public interface Services 
{
	public boolean login();
	public void viewBalance();
	public void addMoney(double amount);
	public void withdrawMoney(double amount);

}
