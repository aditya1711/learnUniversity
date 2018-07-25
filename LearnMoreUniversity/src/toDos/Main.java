package toDos;
import functions.*;
import humanResources.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgInitializer.initialize("E:\\eclipseWorkspace\\LearnMoreUniversity\\database.csv");
		
		Initializer ini = new Initializer();
		
		Student stu = new Student("100,HAHA,17/15,A+,154,50");
		ini.add(stu);
		
		Teacher t = new Teacher("102,HAHA,17/15,B+,154,G1,MATHS");
		ini.add(t);
		
		//Display display = new Display();
		//display.displayByID("102");
		
		//new MedicalBenefits().provideBenefits(t);
	}

}
