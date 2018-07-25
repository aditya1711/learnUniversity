package toDos;

import humanResources.Human;
import humanResources.StakeHolders;

public class Display {
	StakeHolders humansData = StakeHolders.getHumansData();
	
	public void displayByID(String ID, String name){
		/*if(studentsData.getStudent(s) != null){
			display(studentsData.getStudent(s));
		}
		else if(teachersData.getTeacher(s)!=null){
			display(teachersData.getTeacher(s));
		}*/
		ID = ID.toLowerCase();
		name = name.toLowerCase();
		Human h = humansData.getStakeHolderByID(ID);
		//System.out.println(h);
		if(h.getName().equals(name)){
			display(h);
		}
		else{
			System.out.println("name not present");
		}
		
	}
	
	public void display(Human h){
		h.consolePrint();
	}
}
