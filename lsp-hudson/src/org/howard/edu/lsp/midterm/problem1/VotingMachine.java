package org.howard.edu.lsp.midterm.problem1;

import java.util.ArrayList;

public class VotingMachine {
	
	public ArrayList<String> candidates = new ArrayList<>();
	public ArrayList<Integer> votes= new ArrayList<>();
	
	/*
	 * Constructor for class votingmachine
	 */
	public VotingMachine(ArrayList<String> candidates, ArrayList<Integer> votes) {
		this.candidates = candidates;
		this.votes = votes;
	}




	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		candidates.add(name);
		votes.add(0);
	} 
	public void castVotes(String name, int vote) {
		for (int i = 0; i < 4; i++) {
			  if (candidates.get(i) == name) {
				  votes.set(i, vote);
	
			
		
		}
	}
	}
}
		



	
	

