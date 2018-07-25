package humanResources;

public abstract class StakeHolder implements Human {
	public String name,ID, bloodGroup, DOB;
	public int height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setStakeHolderWhole(String s){
		
		s=s.toLowerCase();
		
		String[] data = s.split(",");
		setID(data[0]);
		setName(data[1]);
		setDOB(data[2]);
		setBloodGroup(data[3]);
		setHeight(Integer.parseInt(data[4]));
	}
	
	//@Override
	public boolean equals(StakeHolder sh){
		return sh.getID().equals(getID()) && sh.getName().equals(getName());
	}
	
	@Override
	public int hashCode(){
		return (getID() + getName()).hashCode();
	}
	
	public void consolePrint(){
		System.out.println("ID: " + getID());
		System.out.println("Name: " + getName());
		System.out.println("DOB: " + getDOB());
		System.out.println("BloodGroup: " + getBloodGroup());
		System.out.println("Height: " + getHeight() + " cm");
	}
}
