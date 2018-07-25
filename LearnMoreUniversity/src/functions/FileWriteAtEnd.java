package functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import humanResources.Human;
import humanResources.StakeHolders;

public class FileWriteAtEnd implements Runnable {
	String fileName;
	
	public FileWriteAtEnd(String input){
		fileName = input;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		StakeHolders database = StakeHolders.getHumansData();
		HumanFileInterfacer fi = new HumanFileInterfacer(fileName);
		fi.addAll(database.getAll());
	}

}
