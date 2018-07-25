package functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

import humanResources.Human;
import humanResources.Student;
import humanResources.Teacher;

public class FileInput implements Runnable {
	
	String inputFileName;
	
	public FileInput(String s){
		inputFileName = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void call() {
		// TODO Auto-generated method stub
		Initializer ini = new Initializer();
		HumanFileInterfacer fi = new HumanFileInterfacer(inputFileName);
		Human[] humans = fi.getAll();
		//System.out.println(Arrays.toString(humans));
		for(int i=0;i<humans.length;i++){
			ini.add(humans[i]);
		}
	}

}
