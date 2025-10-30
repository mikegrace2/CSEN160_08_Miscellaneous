package com.csen160.A_JavaDocAndAnnotations;

/**
 * Class BankAccount represents a BankAccount object
 * 
 * @author Sandy Smith
 * @version 1.1
 */
public class BankAccount {
	/**
	 * A unique id for the acct.
	 */
	private String acctId;
	/**
	 * Dollar amount ballence
	 */
	private double balance;

	/**
	 * Creates an empty BankAccount object.
	 */
	public BankAccount() {
		acctId = null;
		balance = 0.0;
	}

	/**
	 * Changes the balance by adding the amount to balance.
	 * 
	 * @param amount dollar amount
	 */
	public void deposit(double amount) {
		balance = amount;
	}

	/**
	 * @return balance which is a double
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Balance:
	 *  if the amount is < balance.Otherwise, throws BalanceLow
	 * @param amount dollar amount
	 * @throws Exception (BalanceLow)
	 */
	public void withdraw(double amount) throws Exception{
		// Code goes here
	}
}