package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;

import java.util.Arrays;

/**
 * This class acts as the client for the Strategy Design Pattern
 * @author azandriahudson
 *
 */

public class Client {

	public static void main(String[] args) throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(33,22,45,67,80,98,79,76,85,88));
		System.out.println("List of grades: " + numbers);
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new TotalAverage());
		int totalAverage = calculator.averageGrades(numbers);
		System.out.println("The average of all grades: " + totalAverage);
		calculator.setStrategy(new DroppedAverage());
		int droppedAverage = calculator.averageGrades(numbers);
		System.out.println("The average of grades with lowest dropped: " + droppedAverage);

	}

}
