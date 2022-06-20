package reflection.apis;

import java.util.Arrays;
import java.util.List;

public class Simple {

	public double InitialSalary = 88000.00;
	public double Incentive = 10000.00;
	public double Allowance = 4500.00;
	public double fullSalary;
	

	public Simple() {
	}

	public Simple(double InitialSalary,double Incentive, double Allowance, double fullSalary) {
		this.InitialSalary = InitialSalary;
		this.Incentive = Incentive;
		this.Allowance = Allowance;
		this.fullSalary = fullSalary;	
	}

	public void finalFullSalary() {
		this.fullSalary = InitialSalary+Incentive+Allowance;
	}

	public double getInitialSalary() {
		return InitialSalary;
	}

	public void setInitialSalary(double initialSalary) {
		InitialSalary = initialSalary;
	}

	public double getIncentive() {
		return Incentive;
	}

	public void setIncentive(double incentive) {
		Incentive = incentive;
	}

	public double getAllowance() {
		return Allowance;
	}

	public void setAllowance(double allowance) {
		Allowance = allowance;
	}

	public double getFullSalary() {
		return fullSalary;
	}

	public void setFullSalary(double fullSalary) {
		this.fullSalary = fullSalary;
	}
	
	

	public String toString() {
		return String.format("(Initial Salary:%.2f, Incentive:%.2f, Allowance:%.2f)", InitialSalary, Incentive,Allowance);
	}
	
	
}
