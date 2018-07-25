package functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import humanResources.Human;
import humanResources.Student;
import humanResources.Teacher;

public class HumanFileInterfacer {
	//private static HumanFileInterfacer fi = new HumanFileInterfacer();
	private static File humanDataFile;
	private static BufferedWriter bw;
	private static Scanner fileInput;
	
	public HumanFileInterfacer(String fileName){
		
		if(humanDataFile==null || !fileName.equals(humanDataFile.getAbsolutePath())){
			humanDataFile = new File(fileName);
			try {
				bw = new BufferedWriter(new FileWriter(humanDataFile));
				fileInput = new Scanner(humanDataFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean addHuman(Human h){
		try {
			bw.write(h.StringForFile());
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addAll(Human[] humans){
		try {
			for(int i=0;i<humans.length;i++){
				bw.write(humans[i].StringForFile());
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
	
	public Human[] getAll(){
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
	}
	
}
