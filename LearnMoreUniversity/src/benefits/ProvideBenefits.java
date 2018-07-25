package benefits;

import functions.FileWriteAtEnd;
import humanResources.Employee;
import humanResources.Human;
import humanResources.StakeHolders;

public class ProvideBenefits implements Runnable{
	
	String fileName;
	MedicalBenefits medicalBenefits = MedicalBenefits.getMedicalBeniftsObject();
	public ProvideBenefits(String f){
		fileName= f;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Runtime.getRuntime().addShutdownHook(new Thread(new BenefitsFileWriterAtEnd(fileName)));
		
		
		StakeHolders database = StakeHolders.getHumansData();
		
		Human[] data = database.getAll();
		for(int i=0;i<data.length;i++){
			Human h = data[i];
			if(h instanceof Employee){
				Employee e = (Employee)h;
				medicalBenefits.provideBenefits(e);
			}
		}
	}
	
}
