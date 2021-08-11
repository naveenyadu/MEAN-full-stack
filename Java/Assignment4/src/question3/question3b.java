package question3;

import java.util.Scanner;

public class question3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id;
		double balance;
		double withdraw;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your account ID");
		id=s.nextLong();
		System.out.println("Enter your account Balance");
		balance=s.nextDouble();
		System.out.println("Enter withdraw amount");
		withdraw=s.nextDouble();
		
		
		try {
			if(withdraw<0) {
				System.out.println("Invalid Withdraw Amount");
				throw new IllegalBankTransactionException("Invalid Withdraw Amount");
			}
			else {
				System.out.println("Withdrawing successfully");
				System.out.println("Remaining balance is : "+(balance-withdraw));
			}
		} catch (IllegalBankTransactionException e) {
			e.printStackTrace();
		}
		

	}



	}


