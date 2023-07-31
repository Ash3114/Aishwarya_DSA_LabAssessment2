package Brackets;

import java.util.Scanner;

public class Client {
	
	public static void main(String args[]) {
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		
		boolean value = balancedBrackets.isBalanced(sc.nextLine());
		
		if(value) {
			System.out.println("The entered String has balanced brackets");
		}
		else {
			System.out.println("The entered string do not contain balanced brackets");
		}
	}

}
