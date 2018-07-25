package benefits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import humanResources.Human;
import humanResources.Student;
import humanResources.Teacher;

public class BenefitsFileInterfacer {
	//private static HumanFileInterfacer fi = new HumanFileInterfacer();
	private static File benefitsDataFile;
	private static BufferedWriter bw;
	private static Scanner fileInput;
	
	public BenefitsFileInterfacer(String fileName){
		
		if(benefitsDataFile==null || !fileName.equals(benefitsDataFile.getAbsolutePath())){
			benefitsDataFile = new File(fileName);
			try {
				bw = new BufferedWriter(new FileWriter(benefitsDataFile));
				fileInput = new Scanner(benefitsDataFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean addBenefitHuman(String empID, Benefit b){
		try {
			bw.write(empID + " Benefits Provided: " + b);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addAll(String[] empIDs, Benefit[] benefits){
		try {
			for(int i=0;i<benefits.length;i++){
				bw.write(empIDs[i] + " Benefits Provided: " + benefits[i]);
				bw.newLine();
			}
			bw.flush();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	/*public Human[] getAll(){
		ArrayList<Human> humanList = new ArrayList<Human>();
		
		while((fileInput.hasNext())){
			String fileLine = fileInput.nextLine();
			
			if(fileLine.startsWith("student")){
				fileLine  = fileLine.replace("student,", "");
				humanList.add(new Student(fileLine));
			}
			else if(fileLine.startsWith("teacher")){
				fileLine  = fileLine.replace("teacher,", "");
				humanList.add(new Teacher(fileLine));
			}
		}
		return humanList.toArray(new Human[humanList.size()]);
	}*/
	
}
