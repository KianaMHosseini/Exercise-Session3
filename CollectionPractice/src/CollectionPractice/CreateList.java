package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreateList {

	public static void main(String[] args) {
		
		Account account1 = new Account(54000, "Mirdamad", "001");
		Account account2 = new Account(34000, "Saadat Abad", "002");
		Account account3 = new Account(22000, "Sohanak", "003");
		Account account4 = new Account(10000, "Heravi", "004");
		Account account5 = new Account(67000, "Ekbatan", "005");
		
		List<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		
		System.out.println("Print objects of the list:");
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		System.out.println("\n*******************************");
		Collections.sort(accounts);
		System.out.println("\nAfter Sorting:");
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		System.out.println("\n*******************************");
		 Account highestBalance = accounts.get(accounts.size() - 1); 
	        System.out.println("Account with the highest balance: " + highestBalance);
		
	        System.out.println("\n*******************************");
	        
	    Collections.sort(accounts, new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				return o2.getBalance() - o1.getBalance();
			}
	    	
		});
	    
		System.out.println("\nAfter Reverse Sorting:");
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		
		}
	
}
