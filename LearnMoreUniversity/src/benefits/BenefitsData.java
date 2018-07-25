package benefits;

import java.util.HashMap;

public class BenefitsData {
	public static BenefitsData bd = new BenefitsData();
	public static HashMap<String,Benefit> dataMap = new HashMap<String, Benefit>();
	private BenefitsData(){
		
	}
	public static BenefitsData getBenefitsDataObject(){
		return bd;
	}
	
	public Benefit getBenefits(String empID){
		return dataMap.get(empID);
	}
	public void addBenefits(String empID, Benefit b){
		dataMap.put(empID, b);
	}
}
