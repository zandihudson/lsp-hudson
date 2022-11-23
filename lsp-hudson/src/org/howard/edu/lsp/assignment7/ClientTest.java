package org.howard.edu.lsp.assignment7;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testig class with different inputs to calculate average grade
 * @author azandriahudson
 *
 */
public class ClientTest {
	
	@DisplayName("Test case 1 for TotalAverage")
	@Test
	public void testTotalAverage() throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(33,22,70,88,90));
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new TotalAverage());
		int total = calculator.averageGrades(numbers);
		assertEquals(60,total);
		
	}
	
	@DisplayName("Test case 2 for TotalAverage")
	@Test
	public void testTotalAverage2() throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(85,82,70,98,60));
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new TotalAverage());
		int total = calculator.averageGrades(numbers);
		assertEquals(79,total);
		
	}
	@DisplayName("Test case 3 for TotalAverage")
	@Test
	public void testTotalAverage3() throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(75,62,70,45,67));
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new TotalAverage());
		int total = calculator.averageGrades(numbers);
		assertEquals(63,total);
		
	}
	@DisplayName("Test case 1 for DroppedAverage")
	@Test
	public void testDroppedAverage() throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(33,22,70,88,90));
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new DroppedAverage());
		int total = calculator.averageGrades(numbers);
		assertEquals(82,total);
		
	}
	
	@DisplayName("Test case 2 for DroppedAverage")
	@Test
	public void testDroppedAverage2() throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(85,82,70,98,60));
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new DroppedAverage());
		int total = calculator.averageGrades(numbers);
		assertEquals(88,total);
		
	}
	@DisplayName("Test case 3 for DroppedAverage")
	@Test
	public void testDroppedAverage3() throws EmptyListException {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(75,62,70,45,67));
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new DroppedAverage());
		int total = calculator.averageGrades(numbers);
		assertEquals(70,total);
		
	}
	/**
	 * Checks if exception is thrown using DroppedAverage implementation
	 */
	@Test
	@DisplayName("Test case 1 for EmptyListException")
	public void emptyListException() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList());
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new DroppedAverage());
		Exception exception = assertThrows(EmptyListException.class, ()->{
			calculator.averageGrades(numbers);
		});
		String expectedMessage = "Average can't be calculated from empty list";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
	}
	/**
	 * Checks if exception is thrown using TotalAverage implementation
	 */
	@Test
	@DisplayName("Test case 2 for EmptyListException")
	public void emptyListException2() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList());
		GradeCalculator calculator = new GradeCalculator();
		calculator.setStrategy(new TotalAverage());
		Exception exception = assertThrows(EmptyListException.class, ()->{
			calculator.averageGrades(numbers);
		});
		String expectedMessage = "Average can't be calculated from empty list";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
	}
	
	
	
	
	
	
	
}
