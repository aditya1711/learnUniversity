package functions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import benefits.ProvideBenefits;

public class ProgInitializer {
	
	static ExecutorService pool = Executors.newCachedThreadPool();
	//static Students initialStudents;
	
	public static void initialize(String inputFileName, String benefitsFileName){
		
		Runtime.getRuntime().addShutdownHook(new Thread(new FileWriteAtEnd(inputFileName)));
		new FileInput(inputFileName).call();
		new ProvideBenefits(benefitsFileName).run();
		
		new Thread(new UserInput()).start();
		
	}
}
