package humanResources;

import benefits.MedicalBenefits;
import functions.DisplayConsole;
import functions.WriteToFile;

public class Teacher extends StakeHolder implements Employee, DisplayConsole, WriteToFile{
	
	public String grade;
	public String subject;
	

	public Teacher(String s){
		setTeacherWhole(s);
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setTeacherWhole(String s){
		super.setStakeHolderWhole(s);
		String[] data = s.split(",");
		setGrade(data[5]);
		setSubject(data[6]);
		MedicalBenefits.getMedicalBeniftsObject().provideBenefits(this);
	}
	
	

	public void consolePrint(){
		super.consolePrint();
		System.out.println("Grade: " + getGrade());
		System.out.println("Subject: " + getSubject());
	}

	@Override
	public String StringForFile() {
		// TODO Auto-generated method stub
		return "teacher," + ID + "," + name + "," + DOB + "," + bloodGroup + "," + height + "," + grade + "," + subject;
	}
}
