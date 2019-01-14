package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("Enter account data");
		    System.out.print("Number: ");
		    int numberOfAccount = sc.nextInt();
		    System.out.print("Holder: ");
		    sc.nextLine();
		    String holder = sc.nextLine();
		    System.out.print("Initial balance: ");
		    double balance = sc.nextDouble();
		    System.out.print("Withdraw limit: ");
		    double withdrawLimit = sc.nextDouble();
		    
		    Account acc = new Account(numberOfAccount, holder, balance, withdrawLimit);
		    
		         System.out.println();
		         System.out.print("Enter amount for withdraw: ");
		         double amount = sc.nextDouble();
		         
		                try {
		                	acc.withdraw(amount);
		                	System.out.println("New Balance: " + String.format("%.2f", acc.getBalance())); 
		                }
		                catch (DomainException err) {
		                	System.out.println("Withdraw error: " + err.getMessage());	
		                }	
		sc.close();
	}
}
