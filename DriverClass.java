package PairSum;

import java.util.Scanner;

import PairSum.PairSum.Node;

public class DriverClass {

	public static void main(String args[]) {
		Node root = null;
		PairSum pairSum = new PairSum();
		root = pairSum.insertData(root,40);
		root = pairSum.insertData(root,20);
		root = pairSum.insertData(root,60);
		root = pairSum.insertData(root,10);
		root = pairSum.insertData(root,30);
		root = pairSum.insertData(root,50);
		root = pairSum.insertData(root,70);
		
		System.out.println("Please enter the value for Sum");
		Scanner sc = new Scanner(System.in);
		int sum=sc.nextInt();
		pairSum.findPairWithSum(root,sum);
	}
}
