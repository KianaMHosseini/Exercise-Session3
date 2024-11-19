package CollectionPractice;

public class Account implements Comparable<Account>{
	
	private int balance;
	private String name;
	private String branch;

	
	public Account(int balance, String name, String branch) {
		super();
		this.balance = balance;
		this.name = name;
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", name=" + name + ", branch=" + branch + "]";
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int compareTo(Account o) {
		return this.balance - o.balance;
	}

}
