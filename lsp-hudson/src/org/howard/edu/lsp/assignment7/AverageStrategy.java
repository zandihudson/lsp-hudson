package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;

/**
 * This is the main interface for the Strategy Design Pattern. 
 * @author azandriahudson
 *
 */
public interface AverageStrategy{
	public int compute(ArrayList<Integer> grades) throws EmptyListException;
	}
