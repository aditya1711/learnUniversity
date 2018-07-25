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
	/*public boolean offerBenefits(String empID, Benefit b){
		if(dataMap.putIfAbsent(empID, b)!=null){
			return false;
		}
		return true;
	}*/
	public void addBenefits(String empID, Benefit b){
		dataMap.putIfAbsent(empID, b);
	}
}
