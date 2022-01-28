package AdvancedLevelPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> BankQNum = new PriorityQueue<>();
		
		BankQNum.add(50);
		BankQNum.offer(30);
		BankQNum.offer(20);
		BankQNum.offer(40);
		BankQNum.offer(10);
		
		System.out.println(BankQNum);
		
		System.out.println("The last num in the list: " +BankQNum.peek());
		System.out.println("Coustomer with num: " +BankQNum.remove() +" is called");
		System.out.println(BankQNum);
		System.out.println("Coustomer with num: " +BankQNum.poll() +" is called");
		System.out.println(BankQNum);
		BankQNum.remove(30);
		System.out.println("Num 30 is removed from the list");
		System.out.println(BankQNum);
		
		System.out.println("Hash code of the final list is: "+BankQNum.hashCode());

		System.out.println("Size of the final list is: "+BankQNum.size());
		
	}

}
