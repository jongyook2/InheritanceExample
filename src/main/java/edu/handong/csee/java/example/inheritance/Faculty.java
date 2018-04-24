package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {
	

		private int FacultyNumber;
		public Faculty()    {
			super();        
			FacultyNumber = 0;//Indicating no number yet    
		}
		
		public Faculty(String initialName, int initialFacultyNumber){
			super(initialName);        
			FacultyNumber = initialFacultyNumber;    
		}
		
		public void reset(String newName, int newFacultyNumber) {
			setName(newName);        
			FacultyNumber = newFacultyNumber;
		}
		
		public int getFacultyNumber() {
			return FacultyNumber;
		}
		
		public void setFacultyNumber(int newFacultyNumber) {
			FacultyNumber = newFacultyNumber;
		}
		
		public void writeOutput() {
			System.out.println("Name: " + getName());
			System.out.println("Faculty Number: " + FacultyNumber); 
		}
		
		public boolean equals(Faculty otherFaculty) {
			return this.hasSameName(otherFaculty) && (this.FacultyNumber == otherFaculty.FacultyNumber);
		} 

	}

