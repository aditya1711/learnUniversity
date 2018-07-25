package functions;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import humanResources.*;
import toDos.Display;

public class UserInput implements Callable, Runnable{
	
	

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		String s;
		Initializer ini = new Initializer();
		
		while(!(s = consoleInput.nextLine()).equals("end console prog")){
			s=s.toLowerCase();
			String[] input = s.split(",");
			
			if(input[0].equals("add")){
				if(input[1].equals("student")){
					String stuInput = "";
					for(int i=2;i<8;i++){
						stuInput = stuInput + input[i] + ",";
					}
					ini.add(new Student(stuInput));
				}
				
				else if(input[1].equals("teacher")){
					String tchInput = "";
					for(int i=2;i<9;i++){
						tchInput = tchInput + input[i] + ",";
					}
					ini.add(new Teacher(tchInput));
				}
			}
			
			else if(input[0].equals("fetch")){
				new Display().displayByID(input[1], input[2]);
			}
			else if(input[0].equals("provide benefits")){
				
			}
		}
		return null;
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


}
