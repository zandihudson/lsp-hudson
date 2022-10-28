package org.howard.edu.lsp.midterm.problem1;

import java.util.ArrayList;



public class Driver {
	public static void main(String[] args)  {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2= new ArrayList<>();

	
	VotingMachine x =  new VotingMachine(list1,list2);
	
	
	
	
	x.addCandidate("Azandria Hudson");
	x.addCandidate("Joe Biden");
	x.addCandidate("Abraham Lincoln");
	
	

	System.out.println("List of candidates: " +x.candidates);
	System.out.println("List of current votes: " +x.votes);
	
	x.addCandidate("George Bush");
	System.out.println("After adding candidate George Bush");
	
	System.out.println("List of candidates: " +x.candidates);
	System.out.println("List of current votes: " +x.votes);
	
	
	x.castVotes("Azandria Hudson", 5);
	x.castVotes("Abraham Lincoln", 4);
	
	System.out.println("After casting 5 votes for Azandria Hudson and 4 for Abraham Lincoln");
	System.out.println("List of candidates: " +x.candidates);
	System.out.println("List of current votes: " +x.votes);
	
	
	

}

	
	
	
	
	
}