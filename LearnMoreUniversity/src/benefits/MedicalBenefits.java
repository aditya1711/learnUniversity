package benefits;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import humanResources.*;

public class MedicalBenefits implements BenefitsProvider {
	
	private static MedicalBenefits mb = new MedicalBenefits();
	private static BenefitsData bd = BenefitsData.getBenefitsDataObject();
	private FileWriter fw;
	
	private MedicalBenefits(){
		File medicalBenefitsDataFile = new File("E:\\eclipseWorkspace\\LearnMoreUniversity\\medical benefits file.txt");
		try {
			fw = new FileWriter(medicalBenefitsDataFile,true);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static MedicalBenefits getMedicalBeniftsObject(){
		return mb;
	}
	
	public void provideBenefits(Employee e){
		Benefit b =  models.MedicalBenefitProvider.decideBenefits(e.getGrade());
		bd.addBenefits(e.getID(), b);
	}
	public void setBenefits(String empID, Benefit b){
		bd.addBenefits(empID, b);
	}
}
