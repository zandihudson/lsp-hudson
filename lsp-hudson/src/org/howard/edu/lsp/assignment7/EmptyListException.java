package org.howard.edu.lsp.assignment7;

/**
 * This class handles the exception of computing an average of an empty list of integers
 * @author azandriahudson
 *
 */
public class EmptyListException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyListException (String message) {
		super(message);
	}
}
