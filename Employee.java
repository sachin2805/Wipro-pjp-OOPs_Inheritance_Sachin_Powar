package OOPS_Inheritance;

public class Employee extends Person {
	private double Salary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	
	public Employee(String name, double Salary, int yearOfJoining, String nationalInsuranceNo) {
		super(name);
		this.Salary = Salary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary() {
		return Salary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee : \nannualSalary= " + Salary + "\nyearOfJoining= " + yearOfJoining + "\nnationalInsuranceNo= "
				+ nationalInsuranceNo + "\nname= " + name ;
	}	
}
