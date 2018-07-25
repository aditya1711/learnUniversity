package humanResources;

import functions.DisplayConsole;
import functions.WriteToFile;

public class Student extends StakeHolder implements Human,DisplayConsole, WriteToFile {
	public int Marks;
	
	public Student(String s){
		setStudentWhole(s);
	}
	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
	public void setStudentWhole(String s){
		super.setStakeHolderWhole(s);
		String[] data = s.split(",");
		setMarks(Integer.parseInt(data[5]));
	}
	
	public void consolePrint(){
		super.consolePrint();
		System.out.println("marks: " + getMarks());
	}
	@Override
	public String StringForFile() {
		// TODO Auto-generated method stub
		return "student," + ID + "," + name + "," + DOB + "," + bloodGroup + "," + height + "," + Marks;
	}
	
}
