package functions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ProgInitializer {
	
	static ExecutorService pool = Executors.newCachedThreadPool();
	//static Students initialStudents;
	
	public static void initialize(String inputFileName){
		
		Runtime.getRuntime().addShutdownHook(new Thread(new FileWriteAtEnd(inputFileName)));
		
		Thread file = new Thread(new FileInput(inputFileName));
		file.start(); 
		try {
			file.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		new Thread(new UserInput()).start();
		
	}
}
