package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

		public Person(String name,  String socialSecurityNumber, int age) {
				this.name = name;
				this.age = age;
				this.socialSecurityNumber = socialSecurityNumber;
				
}
		
		
	
		


		public String toString() {
			 String strAge = String.valueOf(age);
			 String fullString = name + "," + strAge + "," + socialSecurityNumber;
			 return fullString;
		        
		       
		        
			
		}
		
		public boolean equals(Object obj) {
	        
	        Person p5 = (Person) obj;
	

	        return socialSecurityNumber.equals(p5.socialSecurityNumber);
			
		}
		
		
		
		
		
		
}