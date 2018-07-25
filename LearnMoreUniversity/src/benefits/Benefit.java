package benefits;

public enum Benefit {
	grade1Benefits, grade2Benefits, defaultBenefits;
	public static Benefit getBenefit(String grade){
		if(grade.equals("g1")){
			return grade1Benefits;
		}
		if(grade.equals("g2")){
			return grade2Benefits;
		}
		else return defaultBenefits;
	}
}
