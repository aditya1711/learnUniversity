package humanResources;

import java.util.HashMap;
import java.util.Map;

public class StakeHolders {
	public static HashMap<String, Human> humansData;
	public static StakeHolders hs = new StakeHolders(); 
	
	private StakeHolders(){
		humansData = new HashMap<String, Human>();
	}
	public static StakeHolders getHumansData(){
		return hs;
	}
	public Human getStakeHolderByID(String s){
		return humansData.get(s);
	}
	
	public void add(Human h){
		System.out.println(h);
		humansData.put(h.getID(), h);
	}
	
	public Integer getSize(){
		return humansData.size();
	}
	
	public Human[] getAll(){
		Human[] data = new Human[humansData.size()];
		int i=0;
		for(Map.Entry<String, Human> humanEntry : humansData.entrySet()){
			data[i] = humanEntry.getValue();
			i++;
		}
		return data;
	}

}
