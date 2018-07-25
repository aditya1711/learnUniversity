package models;

import benefits.Benefit;

public class MedicalBenefitProvider {
	public static Benefit decideBenefits(String grade){
		return Benefit.getBenefit(grade);
	}
}
