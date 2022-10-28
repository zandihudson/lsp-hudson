package org.howard.edu.lsp.midterm.problem2;

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person("Karen","345-34-5678",50);
		Person p2 = new Person("Bob", "888-23-3512",35);
		Person p3 = new Person ("Jackie", "345-34-5678", 22);
		
		
		
		System.out.println("Person 1: " + p1.toString());
		System.out.println("Person 2: " + p2.toString());
		System.out.println("Person 3: " + p3.toString());
		
		
		
		
		
		System.out.println("Person 1 is equal to Person 3: " + p1.equals(p3));
		System.out.println("Person 1 is equal to Person 2: " + p1.equals(p2));

	}

}
