package benefits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import humanResources.Employee;
import humanResources.Human;
import humanResources.StakeHolders;

public class BenefitsFileWriterAtEnd implements Runnable{
	String fileName;
	
	private BenefitsData bd = BenefitsData.getBenefitsDataObject();
	private BenefitsFileInterfacer fi;
	private StakeHolders humasData = StakeHolders.getHumansData();
	BufferedWriter bw;
	
	public BenefitsFileWriterAtEnd(String f){
		fileName = f;
		
		/*File medicalBenefitsDataFile = new File("E:\\eclipseWorkspace\\LearnMoreUniversity\\medical benefits file.txt");
		try {
			bw = new BufferedWriter(new FileWriter(medicalBenefitsDataFile,true));
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		fi = new BenefitsFileInterfacer(fileName);
		Human[] data = humasData.getAll();
		for(int i=0;i<data.length;i++){
			Human h = data[i];
			if(h instanceof Employee){
				fi.addBenefitHuman(h.getID(), bd.getBenefits(h.getID()));
			}
		}
		
	}
	
}
