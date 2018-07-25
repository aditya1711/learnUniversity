package functions;

import humanResources.*;

public class Initializer {
	/*Students studentsData = Students.getStudents();
	Teachers teachersData = Teachers.getTeachers();*/
	StakeHolders humansData = StakeHolders.getHumansData();
	
	/*public void add(Student s){
		studentsData.addStudent(s);
	}
	
	public void add(Teacher t){
		teachersData.addTeacher(t);
	}*/
	public void add(Human h){
		//System.out.println(h);
		humansData.add(h);
	}
}
