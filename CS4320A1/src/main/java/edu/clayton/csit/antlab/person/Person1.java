package edu.clayton.csit.antlab.person;

public class Person1 {
	//Holds the person's unedited name
	private String name; 

  	//Person1 constructor
	public Person1(String pname) {
     	name = pname;
    	}
  	
	// Method takes a string 'input' and rotates the first two
	// letters to the end. Ex: first --> rstfi
	private String calc(String input) {
		String rotated = "";
		String temp = "";
		for (int i = 0; i < input.length(); i++){
			if (i < 2)
				temp = temp + input.charAt(i);
			else
				rotated = rotated + input.charAt(i);
		}
		rotated = rotated + temp;
		return rotated;
	}
	
	//Return a string rep of this object
	//that varies with an input string
	public String toString(String input) {
	  return name + calc(input);
	}
}
