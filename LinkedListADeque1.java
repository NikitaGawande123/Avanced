package AdvancedLevelLinkedListAsDeque;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListADeque1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> BankQNum = new LinkedList<>();
		
		BankQNum.addLast(10);
		BankQNum.offerFirst(20);
		BankQNum.addLast(30);
		BankQNum.offer(40);
		
		System.out.println(BankQNum);
		
		System.out.println("The last num in the list: " +BankQNum.getLast());
		System.out.println("Coustomer with num: " +BankQNum.removeLast() +" is called");
		System.out.println(BankQNum);
		System.out.println("Coustomer with num: " +BankQNum.pollFirst() +" is called");
		System.out.println(BankQNum);
		BankQNum.remove(30);
		System.out.println("Num 20 is removed from the list");
		System.out.println(BankQNum);
		
		System.out.println("Hash code of the final list is: "+BankQNum.hashCode());
		
	}

}
