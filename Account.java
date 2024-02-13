import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
              
	          private int customerNumber;
	          private int pinNumber;
	          private double checkingBalance =0;
	          private double savingBalance = 0;
	          
	          Scanner input = new Scanner(System.in);
	          DecimalFormat moneyFormat = new DecimalFormat(" '$'###,##00.0");
	         
	          public int setCustomerNumber(int customerNumber) {
					this.customerNumber = customerNumber;
					return  customerNumber;
				}
	          public int getCustomerNumber() {
				          return customerNumber;
				}
	          public int getPinNumber() {
				          return pinNumber;
				}

			public int setPinNumber(int nextInt) {
				this.pinNumber = pinNumber;
				return  pinNumber;
				}
			public double getCheckingBalance() {
				  return checkingBalance;
			}
			public double getSavingBalance() {
				  return savingBalance;
			}
		
			
			public double calcCheckingWithdraw(double amount) {
				    checkingBalance = (checkingBalance - amount);
				    return checkingBalance;
			}
			public double calcSavingWithdraw(double amount) {
			    savingBalance = (savingBalance - amount);
			    return savingBalance;
	    	}
			
			
			public double calcCheckingDeposit(double amount) {
			    checkingBalance = (checkingBalance + amount);
			    return checkingBalance;
		  }
			public double calcSavingDeposit(double amount) {
			    savingBalance = (savingBalance + amount);
			    return savingBalance;
		  }
			
			
			public void getCheckingWithdrawInput() {
				System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
				System.out.println("Amount you want to withdraw from Checking account:");
				double amount = input.nextDouble();
				
				if((checkingBalance - amount) >=0) {
					calcCheckingWithdraw(amount);
					System.out.println("New Checking Amount Balance: " + moneyFormat.format(checkingBalance));
				} 
				else {
					System.out.println("Balance cannot be negative." + "\n");
				}
				
		  }
			
			public void getSavingWithdrawInput() {
				System.out.println("Saving Account Balance: "+ moneyFormat.format(getCheckingBalance()));
				System.out.println("Amount you want to withdraw from Saving account:");
				double amount = input.nextDouble();
				
				if((savingBalance - amount) >=0) {
					calcCheckingWithdraw(amount);
					System.out.println("New saving Amount Balance: " + moneyFormat.format(savingBalance));
				} 
				else {
					System.out.println("Balance cannot be negative." + "\n");
				}
		   }
			
			public  void getCheckingDepositInput() {
				System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
				System.out.println("Amount you want to withdraw from Checking account:");
				double amount = input.nextDouble();
				
				if((checkingBalance + amount) >=0) {
					calcCheckingWithdraw(amount);
					System.out.println("New Checking Amount Balance: " + moneyFormat.format(checkingBalance));
				} 
				else {
					System.out.println("Balance cannot be negative." + "\n");
				  }
	        }
			
			public  void SavingDepositInput() {
				System.out.println("Saving Account Balance: "+ moneyFormat.format(getCheckingBalance()));
				System.out.println("Amount you want to withdraw from saving account:");
				double amount = input.nextDouble();
				
				  if((savingBalance + amount) >=0) {
					calcSavingWithdraw(amount);
					System.out.println("New saving Amount Balance: " + moneyFormat.format(checkingBalance));
				  } 
				  else {
					System.out.println("Balance cannot be negative." + "\n");
				          }
			 }
 }
