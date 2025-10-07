package bank;

public class Account {
	private String accountNo;
	private String Name;
	private double balance;
	
	public Account(String accountNo,String Name) {
		this.accountNo=accountNo;
		this.Name=Name;
		this.balance=0.0;
	}
		public void deposit(double amount) throws InsufficientBalanceException {
			
			if(amount<0) {
				throw new InsufficientBalanceException("deposited amount must be positive");
			}
		balance=balance+amount;
		System.out.println("deposit" + amount + ",new balance" + balance);
		}
		public void withdraw(double amount) throws ArithmeticException,InsufficientBalanceException {
			if(amount<0) {
				throw new ArithmeticException("withdrawal amount must be positive");
			}
			if(amount>balance) {
				throw new InsufficientBalanceException("insufficient balance");
				}
			balance=balance-amount;
			System.out.println("witdrawal" + amount + ",new balance" + balance);
			}
		public void showBalance() {
			System.out.println("account balance for " + Name + "(Account No:"+accountNo+"):" + balance);
		}
		}


