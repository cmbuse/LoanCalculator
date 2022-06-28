package loanCalculator;

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Loan Calculator

You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

Sample Input:
20000

Sample Output:
10628

Here is the monthly payment schedule:
Month 1
Payment: 10% of 20000 = 2000
Remaining amount: 18000
Month 2
Payment: 10% of 18000 = 1800
Remaining amount: 16200
Month 3:
Payment: 10% of 16200 = 1620
Remaining amount: 14580
Use a loop to calculate the payment and remaining amounts for each month.
Also, use integers for amounts.
*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert the amount of money you need: ");
		int amount = scan.nextInt();
		int payment = 1;
		for ( int i= 0; i<3;i++) {
			payment =  (10*amount)/100;
			amount -= payment;
			
		}
		System.out.print("The sum remaining after 3 mounts is: "+ amount);
	}

}
