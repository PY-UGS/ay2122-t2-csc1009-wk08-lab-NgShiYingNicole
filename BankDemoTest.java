import java.util.Scanner;

public class BankDemoTest{
	public static void main(String[] args) {
		try
		{
			CheckingAccount account = new CheckingAccount("ABC1234");
			Scanner input = new Scanner(System.in);
			//a. Deposit $xx into the account object using keyboard input. 
			System.out.println("Enter deposit amount: ");
			double depositAmount = input.nextDouble();
			account.deposit(depositAmount);
			
			//b. Withdraw $yy amount from the account object using keyboard input.
			System.out.println("Enter withdrawal amount: ");
			double withdrawAmount = input.nextDouble();
			account.withdraw(withdrawAmount);
			//c. If $yy < $xx, print out the account balance “The balance after withdraw is: $ ”. 
			System.out.println("The balance after withdraw is: $ "+ account.getBalance());
		}
		catch ( Exception e)
		{
			//d. If $yy > $xx, print the user-defined exception and short amount “Sorry, but your account is short by: $ ”.
			System.out.println("Sorry, but your account is short by: $ "+e.getMessage());
		}
	}
}
