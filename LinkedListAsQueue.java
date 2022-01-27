package AdvancedLevelLinkedListAsQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> BankQNum = new LinkedList<>();
		
		BankQNum.add(10);
		BankQNum.offer(20);
		BankQNum.offer(30);
		BankQNum.offer(40);
		
		System.out.println(BankQNum);
		
		System.out.println("The first num in the list: " +BankQNum.element());
		System.out.println("Coustomer with num: " +BankQNum.remove() +" is called");
		System.out.println(BankQNum);
		System.out.println("Coustomer with num: " +BankQNum.poll() +" is called");
		System.out.println(BankQNum);
	}

}
