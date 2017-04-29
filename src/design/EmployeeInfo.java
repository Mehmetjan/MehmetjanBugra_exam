package design;

public class EmployeeInfo implements Employee{
	String companyName;
	int employeeId;
	String employeeName;
	int yearOfJoining;
	int salary;
	String department;	
	
	public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;
		this.employeeName="";
		this.salary=0;
		this.yearOfJoining=2017;
	}
    public EmployeeInfo(String name, int employeeId){
		this.employeeId=employeeId;
		this.employeeName=name;
		this.salary=0;
		this.yearOfJoining=2017;
	}
	
	public String getCompanyName(){
		return this.companyName;
	}
	public void setCompanyName(String companyName){
		this.companyName=companyName;
	}
	public int employeeId(){
		return this.employeeId;
	}
	public void setEmployeeId(int employeeId){
		this.employeeId=employeeId;
	}
	public String employeeName(){
		return this.employeeName;
	}
	public void setEmployeeName(String name){
		this.employeeName=name;
	}
	public void assignDepartment(){
		this.department="I.T.";
	}
	public String getDepartment(){
		return this.department;
	}
	public int calculateSalary(){
		return this.salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public void benefitLayout(){
		System.out.println("You will get health benefit and lunch.");
	}
	public void setYearOfJoining(int yearOfJoining){
		this.yearOfJoining=yearOfJoining;
	}
	public int getYearOfJoining(){
		return this.yearOfJoining;
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public int calculateEmployeeBonus(int salary, String performance){
		int total=0;
		if(performance.equals("best")){
			total = (int).1*salary;
		}else if(performance.equals("average")){
			total = (int).08*salary;
		}else if(performance.equals("worst")){
			total = 0;
		}
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public int calculateEmployeePension(int salary, int currentYear){
		int total=0;
		int difference = this.yearOfJoining - currentYear;
		total = (int).05*difference*salary;
		return total;
	}
	
	public String toString(){		
		return "Name="+employeeName+" EmployeeID="+employeeId+" Company Name="+companyName+" Year of joining="+yearOfJoining+" Salary="+salary+" Department="+department;
	}
}
