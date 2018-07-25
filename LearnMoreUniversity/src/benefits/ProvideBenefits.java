package benefits;

import humanResources.Employee;
import humanResources.Human;
import humanResources.StakeHolders;

public class ProvideBenefits implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		MedicalBenefits medicalBenefits = MedicalBenefits.getMedicalBeniftsObject();
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
